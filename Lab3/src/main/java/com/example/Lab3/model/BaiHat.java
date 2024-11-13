package com.example.Lab3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "BaiHat")
public class BaiHat {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "TenBaiHat")
    private String tenBaiHat;
    @Column(name = "TenTacGia")
    private String tenTacGia;
    @Column(name = "ThoiLuong")
    private Integer thoiLuong;
    @Column(name = "NgaySanXuat")
    private String ngaySanXuat;
    @Column(name = "Gia")
    private Double gia;
    @Column(name = "PhatHanhDia")
    private Boolean phatHanhDia;
    @Column(name = "NgayRaMat")
    private String ngayRaMat;
}
