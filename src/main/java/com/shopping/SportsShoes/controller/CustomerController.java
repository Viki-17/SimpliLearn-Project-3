package com.shopping.SportsShoes.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.shopping.SportsShoes.model.Customer;
import com.shopping.SportsShoes.model.Product;

import com.shopping.SportsShoes.service.CustomerService;
import com.shopping.SportsShoes.service.ProductService;



@Controller
public class CustomerController {
	

	@Autowired
	private CustomerService aCustomerService;
	
	@Autowired
	private ProductService aProductService;
	

	
	//get all customers
	@GetMapping("/customerlist")
	public String viewCustomers(Model aCustModel){
		aCustModel.addAttribute("listCustomers",aCustomerService.getAllCustomers());
		return "customers";
		
	}
	
	@GetMapping("/customerregisteration")
	public String showCustomerRegisterationForm(Model model) {
		
	
		
		
		
		Customer aCust = new Customer();
		model.addAttribute("customer", aCust);
		
		return "customerregisteration";
	}
	
	@PostMapping("/customervalidate")
	public String customerRegisteration( @ModelAttribute("customer") Customer aCust,Model aModel) {
		
		   
		if (	aCust.getEmail().isEmpty() ||
				aCust.getFirstName().isEmpty()||
				aCust.getLastName().isEmpty()||
				aCust.getPhoneNo().isEmpty()||
				aCust.getPassword().isEmpty()

		) {
					aModel.addAttribute("error","Please enter missing details");
					aModel.addAttribute("condition","false");
					return("customerregisteration");
					
		} else {
			
			Customer existingCustomer =aCustomerService.getCustomerByEmail(aCust.getEmail()); 
			
			if ( (existingCustomer == null ) || 
				 (existingCustomer != null && !aCust.getEmail().equals(existingCustomer.getEmail()))
			) { 
				aCustomerService.saveCustomer(aCust);	
			}
			
			aModel.addAttribute("error","");
			aModel.addAttribute("condition","true");
								
		
			float totalPrice = 0;
  
		return "paymentsummary";
	}
	
	
		
	}}
