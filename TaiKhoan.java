package com.example.datn.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

@Entity
@Table(name = "tai_khoan")
public class TaiKhoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tai_khoan", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "ten_dang_nhap", length = 50)
    private String tenDangNhap;

    @Nationalized
    @Column(name = "mat_khau", length = 100)
    private String matKhau;

    @Nationalized
    @Column(name = "vai_tro", length = 20)
    private String vaiTro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

}