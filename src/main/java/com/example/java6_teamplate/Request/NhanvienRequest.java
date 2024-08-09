package com.example.java6_teamplate.Request;

import com.example.java6_teamplate.entity.ChucVu;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NhanvienRequest {

    private Integer id;
    @NotBlank(message = "mã không được để trống")
    private String ma;
    @NotBlank(message = "ten không được để trống")
    private String ten;

    @NotBlank(message = "ten dem không được để trống")
    private String tenDem;
    @NotBlank(message = "ho không được để trống")
    private String ho;
    @NotBlank(message = "gioiTinh không được để trống")
    private String gioiTinh;
    @NotBlank(message = "dia chi không được để trống")
    private String diaChi;
    @NotBlank(message = "sdt không được để trống")
    private String sdt;
    @NotBlank(message = "matKhau không được để trống")
    private String matKhau;

    @NotNull(message = "chuc vu khong duoc de trong")
    private ChucVu chucVu;

    @NotNull(message = "trang thai khong duoc de trong")
    private Integer trangThai;
}
