package com.example.datn.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDate;

@Entity
@Table(name = "voucher")
public class Voucher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_voucher", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "ma_voucher", length = 50)
    private String maVoucher;

    @Nationalized
    @Column(name = "ten_voucher", length = 100)
    private String tenVoucher;

    @Nationalized
    @Lob
    @Column(name = "mo_ta")
    private String moTa;

    @Nationalized
    @Column(name = "loai_giam_gia", length = 50)
    private String loaiGiamGia;

    @Column(name = "gia_tri_giam")
    private Double giaTriGiam;

    @Column(name = "dieu_kien_ap_dung")
    private Double dieuKienApDung;

    @Column(name = "ngay_bat_dau")
    private LocalDate ngayBatDau;

    @Column(name = "ngay_ket_thuc")
    private LocalDate ngayKetThuc;

    @Column(name = "so_lan_su_dung")
    private Integer soLanSuDung;

    @Nationalized
    @Column(name = "trang_thai", length = 50)
    private String trangThai;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaVoucher() {
        return maVoucher;
    }

    public void setMaVoucher(String maVoucher) {
        this.maVoucher = maVoucher;
    }

    public String getTenVoucher() {
        return tenVoucher;
    }

    public void setTenVoucher(String tenVoucher) {
        this.tenVoucher = tenVoucher;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getLoaiGiamGia() {
        return loaiGiamGia;
    }

    public void setLoaiGiamGia(String loaiGiamGia) {
        this.loaiGiamGia = loaiGiamGia;
    }

    public Double getGiaTriGiam() {
        return giaTriGiam;
    }

    public void setGiaTriGiam(Double giaTriGiam) {
        this.giaTriGiam = giaTriGiam;
    }

    public Double getDieuKienApDung() {
        return dieuKienApDung;
    }

    public void setDieuKienApDung(Double dieuKienApDung) {
        this.dieuKienApDung = dieuKienApDung;
    }

    public LocalDate getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(LocalDate ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public LocalDate getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(LocalDate ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public Integer getSoLanSuDung() {
        return soLanSuDung;
    }

    public void setSoLanSuDung(Integer soLanSuDung) {
        this.soLanSuDung = soLanSuDung;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

}