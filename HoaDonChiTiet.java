package com.example.datn.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

@Entity
@Table(name = "hoa_don_chi_tiet")
public class HoaDonChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hoa_don_chi_tiet", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_hoa_don")
    private HoaDon idHoaDon;

    @Nationalized
    @Column(name = "mau_sac", length = 50)
    private String mauSac;

    @Nationalized
    @Column(name = "kich_thuoc", length = 50)
    private String kichThuoc;

    @Nationalized
    @Column(name = "chat_lieu", length = 100)
    private String chatLieu;

    @Nationalized
    @Column(name = "xuat_xu", length = 100)
    private String xuatXu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public HoaDon getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(HoaDon idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

}