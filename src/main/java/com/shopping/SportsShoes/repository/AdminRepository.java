package com.shopping.SportsShoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.SportsShoes.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository <Admin, Long> { 
	
	Admin findByEmail(String emailAddress);
}