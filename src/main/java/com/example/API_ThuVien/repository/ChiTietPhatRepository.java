package com.example.API_ThuVien.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.API_ThuVien.model.Chitietpphat;

public interface ChiTietPhatRepository {
	public interface YeuThichRepository extends JpaRepository<Chitietpphat, Integer>{

	}
}
