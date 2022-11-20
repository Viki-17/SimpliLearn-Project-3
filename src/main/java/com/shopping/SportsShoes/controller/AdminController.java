package com.shopping.SportsShoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.shopping.SportsShoes.model.Admin;
import com.shopping.SportsShoes.service.AdminService;
import com.shopping.SportsShoes.service.ProductService;



@Controller
public class AdminController {
	
	@Autowired
	private AdminService aAdminService;
	
	@Autowired
	private ProductService aProductService;
	
	
	@GetMapping("/adminlogin")
	public String showNewEmployeeForm(Model model) {
		
		Admin aAdmin = new Admin();
		model.addAttribute("admin", aAdmin);
		
		return "adminlogin";
	}
	
	
	@PostMapping("/adminValidate")
	public String logInValidate( @ModelAttribute("admin") Admin aAdmin,Model aProdModel) {
		
		if (aAdmin.getEmail().isEmpty()) {
			aProdModel.addAttribute ("error","Pls enter UserId and Password ");
			return "adminlogin";
		}
		
		Admin validate = aAdminService.getAdminByEmail(aAdmin.getEmail());
		
		String password = aAdmin.getPassword();
		
		 if(validate !=null && password.equals(validate.getPassword())){ 
				aProdModel.addAttribute("listProducts",aProductService.getAllProducts());
				aProdModel.addAttribute ("error","Welcome ");
				return "products";
		
		}else {
			aProdModel.addAttribute ("error","Wrong credential - please try again");
			return "adminlogin";	
		}
	
	}
}
