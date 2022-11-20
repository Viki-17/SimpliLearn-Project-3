package com.shopping.SportsShoes.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.shopping.SportsShoes.model.Category;
import com.shopping.SportsShoes.model.Product;
import com.shopping.SportsShoes.service.CategoryService;
import com.shopping.SportsShoes.service.ProductService;

@Controller
public class ProductController {


	@Autowired
	private ProductService aProductService;
	
	@Autowired
	private CategoryService aCategoryService;
	
	
	@GetMapping("/products")
	public String viewCustomers(Model aProdModel){
		aProdModel.addAttribute("listProducts",aProductService.getAllProducts());
		return "products";
		
	}
	
	@GetMapping("/insertProductForm")
	public String showNewProductForm(Model model) {
		// create model attribute to bind form data
		Product aProduct = new Product();
		model.addAttribute("product", aProduct);
		model.addAttribute("category",aCategoryService.getAllCategorys());
		model.addAttribute("error"," ");
		
		
		return "addproduct";
	}
	
	
	@PostMapping("/saveProduct")
	public String saveEmployee( @ModelAttribute("product") Product aProduct, Model aModel) {
		
	
		System.out.println("Date of Expiry"+aProduct.getDateOfExpiry());
		System.out.println("Date of Man"+aProduct.getDateofManufature());
		
		if ( aProduct.getManufacturedBy().isEmpty() ||
			 aProduct.getShortName().isEmpty() ||
			 aProduct.getColor().isEmpty()||
			 aProduct.getPrice() == 0.0 ||
			 aProduct.getColor().isEmpty()||
			 aProduct.getDateOfExpiry()==null ||
			 aProduct.getDateofManufature()==null
	
		) {
			
			
			aModel.addAttribute("error","Please enter missing details");
			aModel.addAttribute("condition","false");
			
			aModel.addAttribute("category",aCategoryService.getAllCategorys());
			
			return "addproduct";
		}
		
		
		
		Category aCategory = aProduct.getCategory();	
		
		aCategory = aCategoryService.getCategoryById(aCategory.getId());
		aProduct.setCatType(aCategory.getType());
		
;		aProduct.setCategory(aCategory);
		aProductService.saveProduct(aProduct);
		
	//	System.out.println("Product: "+aProduct);	
		
		return "redirect:/products";
	}
	
	
	@GetMapping("/updateProductForm/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
		
		Product aProduct = aProductService.getProductById(id);
		
		model.addAttribute("product", aProduct);
		model.addAttribute("category",aCategoryService.getAllCategorys());
		return "updateproduct";
	}
	
	@GetMapping("/deleteProduct/{id}")
	public String deleteEmployee(@PathVariable (value = "id") long id) {
		
		this.aProductService.deleteProductById(id);
		return "redirect:/products";
	}
	
}