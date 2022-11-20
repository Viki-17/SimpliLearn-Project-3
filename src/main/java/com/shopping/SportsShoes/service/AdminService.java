package com.shopping.SportsShoes.service;

import java.util.List;

import com.shopping.SportsShoes.model.Admin;

public interface AdminService {
	
	List<Admin> getAllAdmin();
	void saveAdmin(Admin aAdmin);
	Admin getAdminByEmail(String email);
	
}

