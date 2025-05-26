package com.example.datn.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

@Entity
@Table(name = "san_pham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_san_pham", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "ten_san_pham")
    private String tenSanPham;

    @Nationalized
    @Lob
    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "gia_ban")
    private Double giaBan;

    @Column(name = "so_luong_ton")
    private Integer soLuongTon;

    @Nationalized
    @Column(name = "anh_san_pham")
    private String anhSanPham;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

    public Integer getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(Integer soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public String getAnhSanPham() {
        return anhSanPham;
    }

    public void setAnhSanPham(String anhSanPham) {
        this.anhSanPham = anhSanPham;
    }

}