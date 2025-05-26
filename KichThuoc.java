package com.example.datn.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

@Entity
@Table(name = "kich_thuoc")
public class KichThuoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_kich_thuoc", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "ten_kich_thuoc", length = 50)
    private String tenKichThuoc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenKichThuoc() {
        return tenKichThuoc;
    }

    public void setTenKichThuoc(String tenKichThuoc) {
        this.tenKichThuoc = tenKichThuoc;
    }

}