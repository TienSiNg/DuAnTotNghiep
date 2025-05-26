package com.example.datn.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

@Entity
@Table(name = "nhan_vien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nhan_vien", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "ho_ten", length = 100)
    private String hoTen;

    @Nationalized
    @Column(name = "email", length = 100)
    private String email;

    @Nationalized
    @Column(name = "sdt", length = 20)
    private String sdt;

    @Nationalized
    @Lob
    @Column(name = "dia_chi")
    private String diaChi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

}