package com.example.API_ThuVien.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.API_ThuVien.model.Chitietmuontra;
import com.example.API_ThuVien.repository.ChiTietMuonTraRepository;

@RestController
@RequestMapping("/chitietphat")
public class ChiTietPhatContoller {
	@Autowired
    private ChiTietMuonTraRepository chitietphatRepository;
	
	@GetMapping("")
    public List<Chitietmuontra> getAllChitietmuontra() {
        return chitietphatRepository.findAll();
    }
}
