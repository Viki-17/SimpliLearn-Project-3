package com.shopping.SportsShoes.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.SportsShoes.model.Admin;
import com.shopping.SportsShoes.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired 
	private AdminRepository aAdminRepository;

	@Override
	public List<Admin> getAllAdmin() {
			return aAdminRepository.findAll();		
	}

	@Override
	public void saveAdmin(Admin aAdmin) {	
			this.aAdminRepository.save(aAdmin);	
	}

	@Override
	public Admin getAdminByEmail(String email) {
		
		Admin aAdmin = aAdminRepository.findByEmail(email);
		// todo exception handling
		return aAdmin;

	}
}


	