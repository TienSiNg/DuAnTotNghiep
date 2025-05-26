package com.example.datn.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDate;

@Entity
@Table(name = "hoa_don")
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hoa_don", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "ma", length = 50)
    private String ma;

    @Nationalized
    @Column(name = "ten_nguoi_mua", length = 100)
    private String tenNguoiMua;

    @Nationalized
    @Lob
    @Column(name = "dia_chi_nguoi_mua")
    private String diaChiNguoiMua;

    @Nationalized
    @Column(name = "sdt_nguoi_mua", length = 20)
    private String sdtNguoiMua;

    @Column(name = "tong_tien")
    private Double tongTien;

    @Column(name = "ngay_dat_hang")
    private LocalDate ngayDatHang;

    @Nationalized
    @Column(name = "trang_thai", length = 20)
    private String trangThai;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenNguoiMua() {
        return tenNguoiMua;
    }

    public void setTenNguoiMua(String tenNguoiMua) {
        this.tenNguoiMua = tenNguoiMua;
    }

    public String getDiaChiNguoiMua() {
        return diaChiNguoiMua;
    }

    public void setDiaChiNguoiMua(String diaChiNguoiMua) {
        this.diaChiNguoiMua = diaChiNguoiMua;
    }

    public String getSdtNguoiMua() {
        return sdtNguoiMua;
    }

    public void setSdtNguoiMua(String sdtNguoiMua) {
        this.sdtNguoiMua = sdtNguoiMua;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    public LocalDate getNgayDatHang() {
        return ngayDatHang;
    }

    public void setNgayDatHang(LocalDate ngayDatHang) {
        this.ngayDatHang = ngayDatHang;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

}