package com.example.java6_teamplate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "nhan_vien")
@Entity
public class NhanVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;
    @Column(name = "ten_dem")
    private String tenDem;
    @Column(name = "ho")
    private String ho;
    @Column(name = "Gioi_tinh")
    private String gioiTinh;
    @Column(name = "dia_chi")
    private String diaChi;
    @Column(name = "sdt")
    private String sdt;
    @Column(name = "mat_khau")
    private String matKhau;

    @JoinColumn(name = "id_cv")
    @ManyToOne
    private ChucVu chucVu;


    @Column(name = "trang_thai")
    private Integer trangThai;
}
