package com.example.datn.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDate;

@Entity
@Table(name = "khach_hang")
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_khach_hang", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "ho_va_ten", length = 100)
    private String hoVaTen;

    @Nationalized
    @Column(name = "email", length = 100)
    private String email;

    @Nationalized
    @Column(name = "mat_khau", length = 100)
    private String matKhau;

    @Nationalized
    @Column(name = "so_dien_thoai", length = 20)
    private String soDienThoai;

    @Nationalized
    @Lob
    @Column(name = "dia_chi_giao_hang")
    private String diaChiGiaoHang;

    @Column(name = "diem_tich_luy")
    private Integer diemTichLuy;

    @Column(name = "ngay_dang_ky")
    private LocalDate ngayDangKy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChiGiaoHang() {
        return diaChiGiaoHang;
    }

    public void setDiaChiGiaoHang(String diaChiGiaoHang) {
        this.diaChiGiaoHang = diaChiGiaoHang;
    }

    public Integer getDiemTichLuy() {
        return diemTichLuy;
    }

    public void setDiemTichLuy(Integer diemTichLuy) {
        this.diemTichLuy = diemTichLuy;
    }

    public LocalDate getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(LocalDate ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

}