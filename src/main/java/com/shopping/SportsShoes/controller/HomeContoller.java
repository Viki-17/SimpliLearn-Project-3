package com.shopping.SportsShoes.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.shopping.SportsShoes.model.Product;

import com.shopping.SportsShoes.service.ProductService;

@Controller
public class HomeContoller {

	@Autowired
	private ProductService aProductService;

	
	@GetMapping("/")
	public String home( Model aProdModel){
		
		List<Product> listOfProducts = aProductService.getAllProducts();
		
        Iterator<Product> productIterator = listOfProducts.iterator();
        
        HashMap <String, List<Product> > myDict = new HashMap<String, List<Product> >();
      
        Product aProduct;
        List<Product> aProdList;
        
        while (productIterator.hasNext()) {
        	
        	aProduct = productIterator.next();
        	if ( myDict.containsKey(aProduct.getCategory().getType()) ){
        		aProdList = myDict.get(aProduct.getCategory().getType());
        		aProdList.add(aProduct); 
        	//	System.out.println ("Updatting to exisitng Category" + aProduct.getCategory().getType());
        	//	System.out.println ("the product" + aProduct.toString());
        	} else {
      	
        		List<Product> aNewProdList = new ArrayList<Product>();
        		aNewProdList.add(aProduct);
        		myDict.put (aProduct.getCategory().getType(),aNewProdList);
        	//	System.out.println ("New  Category" + aProduct.getCategory().getType());
        	//	System.out.println ("the product" + aProduct.toString());
        	}
        	
        }
        

		
        aProdModel.addAttribute("productbycategory", myDict);
        
		return "index";
		
	}
	
	@GetMapping("index")
	public String index( Model aProdModel){
		
		List<Product> listOfProducts = aProductService.getAllProducts();
		
        Iterator<Product> productIterator = listOfProducts.iterator();
        
        HashMap <String, List<Product> > myDict = new HashMap<String, List<Product> >();
      
        Product aProduct;
        List<Product> aProdList;
        
        while (productIterator.hasNext()) {
        	
        	aProduct = productIterator.next();
        	if ( myDict.containsKey(aProduct.getCategory().getType()) ){
        		aProdList = myDict.get(aProduct.getCategory().getType());
        		aProdList.add(aProduct); 
        		System.out.println ("Updatting to exisitng Category" + aProduct.getCategory().getType());
        		System.out.println ("the product" + aProduct.toString());
        	} else {
      	
        		List<Product> aNewProdList = new ArrayList<Product>();
        		aNewProdList.add(aProduct);
        		myDict.put (aProduct.getCategory().getType(),aNewProdList);
        		System.out.println ("New  Category" + aProduct.getCategory().getType());
        		System.out.println ("the product" + aProduct.toString());
        	}
        	
        }
        
     
        
        aProdModel.addAttribute("productbycategory", myDict);
		
		return "index";
		
	}
}
	