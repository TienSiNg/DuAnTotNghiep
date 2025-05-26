package com.example.datn.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

@Entity
@Table(name = "mau_sac")
public class MauSac {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mau_sac", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "ten_mau", length = 50)
    private String tenMau;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenMau() {
        return tenMau;
    }

    public void setTenMau(String tenMau) {
        this.tenMau = tenMau;
    }

}