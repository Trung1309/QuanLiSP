/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

/**
 *
 * @author Admin
 */
public class product {
    private String maSP,tenSP,nhaCC,giaBan;
    int soLuong;

    public product(String tenSP, String nhaCC, String giaBan, int soLuong) {
        this.tenSP = tenSP;
        this.nhaCC = nhaCC;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
    }

    public product() {
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getNhaCC() {
        return nhaCC;
    }

    public void setNhaCC(String nhaCC) {
        this.nhaCC = nhaCC;
    }

    public String getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}
