package com.example.datn.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

@Entity
@Table(name = "chat_lieu")
public class ChatLieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_chat_lieu", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "ten_chat_lieu", length = 100)
    private String tenChatLieu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenChatLieu() {
        return tenChatLieu;
    }

    public void setTenChatLieu(String tenChatLieu) {
        this.tenChatLieu = tenChatLieu;
    }

}