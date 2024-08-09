package com.example.java6_teamplate.repository;

import com.example.java6_teamplate.Respose.NhanvienResponse;
import com.example.java6_teamplate.entity.NhanVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien,Integer> {

    @Query("""
    select new com.example.java6_teamplate.Respose.NhanvienResponse(
        nv.id,
        nv.ma,
        nv.ten,
        nv.tenDem,
        nv.ho,
        nv.gioiTinh,
        nv.diaChi,
        nv.sdt,
        nv.matKhau,
        nv.chucVu.ten,
        nv.trangThai
    ) from NhanVien nv
""")
    Page<NhanvienResponse> phanTrang(Pageable pageable);


    @Query("""
    select new com.example.java6_teamplate.Respose.NhanvienResponse(
        nv.id,
        nv.ma,
        nv.ten,
        nv.tenDem,
        nv.ho,
        nv.gioiTinh,
        nv.diaChi,
        nv.sdt,
        nv.matKhau,
        nv.chucVu.ten,
        nv.trangThai
    ) from NhanVien nv
""")

    List<NhanvienResponse> getallReponse();
}
