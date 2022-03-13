/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Connect.DatabaseHelper;
import Product.product;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class ProductDao {
    public ArrayList<product> getListProduct() throws Exception{
        ArrayList<product> list = new ArrayList<>();
        String sql = "select * from Product ";
        Connection conn = DatabaseHelper.openConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                product p = new product();
                p.setMaSP(rs.getString("maSP"));
                p.setTenSP(rs.getString("tenSP"));
                p.setSoLuong(rs.getInt("soLuong"));
                p.setGiaBan(rs.getString("giaBan"));
                p.setNhaCC(rs.getString("nhaCC"));
                
                list.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public boolean insert(product pr ) throws Exception{
        String sql = "insert into Product(maSP,tenSP,soLuong,giaBan,nhaCC)"
                + "values(?,?,?,?,?)";
        Connection conn = DatabaseHelper.openConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, pr.getMaSP());
        ps.setString(2, pr.getTenSP());
        ps.setInt(3, pr.getSoLuong());
        ps.setString(4, pr.getGiaBan());
        ps.setString(5, pr.getNhaCC());
        
        return ps.executeUpdate()>0;
        
    }
    
    public boolean update(product pr ) throws Exception{
        String sql = "update Product "
                + "set tenSP = ?, soLuong = ? , giaBan = ?, nhaCC = ?"
                + "where  maSP = ?";
        {
        Connection conn = DatabaseHelper.openConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(5, pr.getMaSP());
        ps.setString(1, pr.getTenSP());
        ps.setInt(2, pr.getSoLuong());
        ps.setString(3, pr.getGiaBan());
        ps.setString(4, pr.getNhaCC());
        
        return ps.executeUpdate()>0;
        }
        
    }
    
    public boolean delete(String maSP) throws Exception{
        String sql = "delete "
                + "from Product "
                + "where maSP = ?";
        Connection conn = DatabaseHelper.openConnection();
        PreparedStatement pr = conn.prepareStatement(sql);
        {
            
            pr.setString(1, maSP);
        }
        return pr.executeUpdate()>0;
    }
    
}
