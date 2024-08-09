package com.example.java6_teamplate.Respose;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NhanvienResponse {
    private Integer id;
    private String ma;
    private String ten;
    private String tenDem;
    private String ho;
    private String gioiTinh;
    private String diaChi;
    private String sdt;
    private String matKhau;
    private String TenChucVu;
    private Integer trangThai;


}
