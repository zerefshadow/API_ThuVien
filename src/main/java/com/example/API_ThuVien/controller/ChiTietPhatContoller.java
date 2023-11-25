package com.example.API_ThuVien.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.API_ThuVien.model.Chitietmuontra;
import com.example.API_ThuVien.repository.ChiTietMuonTraRepository;
import com.example.API_ThuVien.repository.ChiTietPhatRepository;
import com.example.API_ThuVien.model.Chitietpphat;

@RestController
@RequestMapping("/chitietphat")
public class ChiTietPhatContoller {
	@Autowired
    private ChiTietPhatRepository chitietphatRepository;
	
	// Tạo một chi tiết mượn trả mới
    @PostMapping("")
    public Chitietpphat createChitietmuontra(@RequestBody Chitietpphat chitietphat ) {
        return chitietphatRepository.save(chitietphat);
    }
	
	@GetMapping("")
    public List<Chitietpphat> getAllChitietmuontra() {
        return chitietphatRepository.findAll();
    }
}
