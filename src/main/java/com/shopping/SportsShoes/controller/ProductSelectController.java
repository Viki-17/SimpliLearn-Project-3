package com.shopping.SportsShoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.shopping.SportsShoes.model.Category;

import com.shopping.SportsShoes.service.CategoryService;
import com.shopping.SportsShoes.service.ProductService;

@Controller
public class ProductSelectController {
		
		@Autowired
		private ProductService aProductService;
		
		@Autowired
		private CategoryService aCategoryService;
		
	    
		@GetMapping("/selectCategoryForm/{bucket}")	
		public String showFormForUpdate(@PathVariable ( value = "bucket") String bucket, Model model) {
	
			Category aCategory =  aCategoryService.getCategorytByType(bucket);
			
			System.out.println (aCategory.toString());
			System.out.println( aProductService.getProductsByType(bucket));
			
			System.out.println("Type Selected :" +bucket );	
			model.addAttribute("productlist",aProductService.getProductsByType(bucket) );
		
			
			return "buyproduct";

		}
}
