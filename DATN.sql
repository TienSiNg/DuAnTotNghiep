-- Xóa database nếu đã tồn tại
IF EXISTS (SELECT name FROM sys.databases WHERE name = 'DATN')
BEGIN
    ALTER DATABASE DATN SET SINGLE_USER WITH ROLLBACK IMMEDIATE;
    DROP DATABASE DATN;
END
GO

-- Tạo mới database
CREATE DATABASE DATN;
GO

-- Sử dụng database
USE DATN;
GO

-- Bảng không phụ thuộc
CREATE TABLE danh_muc (
  id_danh_muc INT IDENTITY(1,1) PRIMARY KEY,
  ten_danh_muc NVARCHAR(100),
  mo_ta NVARCHAR(MAX)
);

CREATE TABLE mau_sac (
  id_mau_sac INT IDENTITY(1,1) PRIMARY KEY,
  ten_mau NVARCHAR(50)
);

CREATE TABLE kich_thuoc (
  id_kich_thuoc INT IDENTITY(1,1) PRIMARY KEY,
  ten_kich_thuoc NVARCHAR(50)
);

CREATE TABLE chat_lieu (
  id_chat_lieu INT IDENTITY(1,1) PRIMARY KEY,
  ten_chat_lieu NVARCHAR(100)
);

CREATE TABLE tai_khoan (
  id_tai_khoan INT IDENTITY(1,1) PRIMARY KEY,
  ten_dang_nhap NVARCHAR(50),
  mat_khau NVARCHAR(100),
  vai_tro NVARCHAR(20)
);

CREATE TABLE phuong_thuc_thanh_toan (
  id_phuong_thuc INT IDENTITY(1,1) PRIMARY KEY,
  ten_phuong_thuc NVARCHAR(100),
  mo_ta NVARCHAR(MAX)
);

CREATE TABLE voucher (
  id_voucher INT IDENTITY(1,1) PRIMARY KEY,
  ma_voucher NVARCHAR(50),
  ten_voucher NVARCHAR(100),
  mo_ta NVARCHAR(MAX),
  loai_giam_gia NVARCHAR(50),
  gia_tri_giam FLOAT,
  dieu_kien_ap_dung FLOAT,
  ngay_bat_dau DATE,
  ngay_ket_thuc DATE,
  so_lan_su_dung INT,
  trang_thai NVARCHAR(50)
);

CREATE TABLE nhan_vien (
  id_nhan_vien INT IDENTITY(1,1) PRIMARY KEY,
  ho_ten NVARCHAR(100),
  email NVARCHAR(100),
  sdt NVARCHAR(20),
  dia_chi NVARCHAR(MAX)
);

-- Bảng phụ thuộc tai_khoan
CREATE TABLE khach_hang (
  id_khach_hang INT IDENTITY(1,1) PRIMARY KEY,
  id_tai_khoan INT FOREIGN KEY REFERENCES tai_khoan(id_tai_khoan),
  ho_va_ten NVARCHAR(100),
  email NVARCHAR(100),
  mat_khau NVARCHAR(100),
  so_dien_thoai NVARCHAR(20),
  dia_chi_giao_hang NVARCHAR(MAX),
  diem_tich_luy INT DEFAULT 0,
  ngay_dang_ky DATE
);

-- Bảng sản phẩm và chi tiết
CREATE TABLE san_pham (
  id_san_pham INT IDENTITY(1,1) PRIMARY KEY,
  id_danh_muc INT FOREIGN KEY REFERENCES danh_muc(id_danh_muc),
  ten_san_pham NVARCHAR(255),
  mo_ta NVARCHAR(MAX),
  gia_ban FLOAT,
  so_luong_ton INT,
  anh_san_pham NVARCHAR(255)
);

CREATE TABLE san_pham_chi_tiet (
  id_san_pham_chi_tiet INT IDENTITY(1,1) PRIMARY KEY,
  id_san_pham INT FOREIGN KEY REFERENCES san_pham(id_san_pham),
  id_mau_sac INT FOREIGN KEY REFERENCES mau_sac(id_mau_sac),
  id_kich_thuoc INT FOREIGN KEY REFERENCES kich_thuoc(id_kich_thuoc),
  id_chat_lieu INT FOREIGN KEY REFERENCES chat_lieu(id_chat_lieu),
  mau_sac NVARCHAR(50),
  kich_thuoc NVARCHAR(50),
  chat_lieu NVARCHAR(100),
  ngay_nhap DATE,
  xuat_xu NVARCHAR(100)
);

-- Bảng giỏ hàng và chi tiết giỏ hàng
CREATE TABLE gio_hang (
  id_gio_hang INT IDENTITY(1,1) PRIMARY KEY,
  id_khach_hang INT FOREIGN KEY REFERENCES khach_hang(id_khach_hang),
  ngay_tao DATE,
  trang_thai NVARCHAR(20),
  tong_tien_tam_tinh DECIMAL(18,2)
);

CREATE TABLE chi_tiet_gio_hang (
  id_chi_tiet_gio_hang INT IDENTITY(1,1) PRIMARY KEY,
  id_gio_hang INT FOREIGN KEY REFERENCES gio_hang(id_gio_hang),
  id_san_pham INT FOREIGN KEY REFERENCES san_pham(id_san_pham),
  so_luong INT,
  thanh_tien FLOAT
);

-- Bảng hóa đơn và chi tiết hóa đơn
CREATE TABLE hoa_don (
  id_hoa_don INT IDENTITY(1,1) PRIMARY KEY,
  id_khach_hang INT FOREIGN KEY REFERENCES khach_hang(id_khach_hang),
  id_nhan_vien INT FOREIGN KEY REFERENCES nhan_vien(id_nhan_vien),
  id_voucher INT FOREIGN KEY REFERENCES voucher(id_voucher),
  id_phuong_thuc INT FOREIGN KEY REFERENCES phuong_thuc_thanh_toan(id_phuong_thuc),
  ma NVARCHAR(50),
  ten_nguoi_mua NVARCHAR(100),
  dia_chi_nguoi_mua NVARCHAR(MAX),
  sdt_nguoi_mua NVARCHAR(20),
  tong_tien FLOAT,
  ngay_dat_hang DATE,
  trang_thai NVARCHAR(20)
);

CREATE TABLE hoa_don_chi_tiet (
  id_hoa_don_chi_tiet INT IDENTITY(1,1) PRIMARY KEY,
  id_hoa_don INT FOREIGN KEY REFERENCES hoa_don(id_hoa_don),
  id_san_pham INT FOREIGN KEY REFERENCES san_pham(id_san_pham),
  id_san_pham_chi_tiet INT FOREIGN KEY REFERENCES san_pham_chi_tiet(id_san_pham_chi_tiet),
  mau_sac NVARCHAR(50),
  kich_thuoc NVARCHAR(50),
  chat_lieu NVARCHAR(100),
  xuat_xu NVARCHAR(100)
);

-- Bảng đánh giá và yêu thích
CREATE TABLE danh_gia (
  id_danh_gia INT IDENTITY(1,1) PRIMARY KEY,
  id_khach_hang INT FOREIGN KEY REFERENCES khach_hang(id_khach_hang),
  id_san_pham INT FOREIGN KEY REFERENCES san_pham(id_san_pham),
  so_sao INT,
  binh_luan NVARCHAR(MAX),
  ngay_danh_gia DATE
);

CREATE TABLE yeu_thich (
  id_yeu_thich INT IDENTITY(1,1) PRIMARY KEY,
  id_khach_hang INT FOREIGN KEY REFERENCES khach_hang(id_khach_hang),
  id_san_pham INT FOREIGN KEY REFERENCES san_pham(id_san_pham),
  ngay_them DATE
);
