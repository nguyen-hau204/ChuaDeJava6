package com.example.java6_teamplate.controller;

import com.example.java6_teamplate.Request.NhanvienRequest;
import com.example.java6_teamplate.Respose.NhanvienResponse;
import com.example.java6_teamplate.entity.NhanVien;
import com.example.java6_teamplate.repository.ChucVuRepository;
import com.example.java6_teamplate.repository.NhanVienRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ipa-nhanvien")
public class Controller {

    @Autowired
    NhanVienRepository reponv;

    @Autowired
    ChucVuRepository repocv;
//    @GetMapping
//    public List<NhanVien> getall(){
//        return reponv.findAll();
//    }

    @GetMapping
    public List<NhanvienResponse> get(){
        return reponv.getallReponse();
    }

    @GetMapping("/phantrang")
    public List<NhanvienResponse> phanTrang(@RequestParam(value = "currentPage", defaultValue = "0") Integer currentPage) {
        int size = 5;
        Pageable pageable = PageRequest.of(currentPage, size);
        Page<NhanvienResponse> pageResult = reponv.phanTrang(pageable);
        return pageResult.getContent();
    }


    @PostMapping
    public String add(@RequestBody @Valid NhanvienRequest nhanvienRequest, BindingResult result){

        if (result.hasErrors()){
            return "thêm lôi";
        }
        NhanVien nhanVien = new NhanVien();
        BeanUtils.copyProperties(nhanvienRequest,nhanVien);
        reponv.save(nhanVien);
        return "thêm thành công ";
    }

    @PutMapping
    public String update(@RequestBody @Valid NhanvienRequest nhanvienRequest, BindingResult result){
        if (result.hasErrors()){
            return "sửa lỗi";
        }
        NhanVien nhanVien = new NhanVien();
        BeanUtils.copyProperties(nhanvienRequest,nhanVien);
        reponv.save(nhanVien);
        return "sửa thành công ";
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        reponv.deleteById(id);
    }
}
