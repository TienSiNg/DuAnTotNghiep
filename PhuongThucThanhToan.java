package com.example.datn.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

@Entity
@Table(name = "phuong_thuc_thanh_toan")
public class PhuongThucThanhToan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_phuong_thuc", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "ten_phuong_thuc", length = 100)
    private String tenPhuongThuc;

    @Nationalized
    @Lob
    @Column(name = "mo_ta")
    private String moTa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenPhuongThuc() {
        return tenPhuongThuc;
    }

    public void setTenPhuongThuc(String tenPhuongThuc) {
        this.tenPhuongThuc = tenPhuongThuc;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

}