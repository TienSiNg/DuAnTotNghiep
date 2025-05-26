package com.example.datn.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "yeu_thich")
public class YeuThich {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_yeu_thich", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_khach_hang")
    private KhachHang idKhachHang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_san_pham")
    private SanPham idSanPham;

    @Column(name = "ngay_them")
    private LocalDate ngayThem;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public KhachHang getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(KhachHang idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public SanPham getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(SanPham idSanPham) {
        this.idSanPham = idSanPham;
    }

    public LocalDate getNgayThem() {
        return ngayThem;
    }

    public void setNgayThem(LocalDate ngayThem) {
        this.ngayThem = ngayThem;
    }

}