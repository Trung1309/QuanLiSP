create database QuanLiSanPham
go 
use QuanLiSanPham
go

create table Product(
	maSP varchar(10) not null primary key,
	tenSP nvarchar(50) not null,
	soLuong int,
	giaBan money,
	nhaCC nvarchar(50)
)

insert into  Product(maSP,tenSP,soLuong,giaBan,nhaCC)
values ('SP001',N'Bàn Gh?','100','209093','Bàn gh? Hà Nam')