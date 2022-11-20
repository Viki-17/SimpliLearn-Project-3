package com.shopping.SportsShoes.service;

import java.util.List;

import com.shopping.SportsShoes.model.Product;

public interface ProductService {
	
	List<Product> getAllProducts();
	
	List<Product> getProductsByType(String type);

	void saveProduct(Product aProduct);
	
	Product getProductById(long id);
	
	void deleteProductById(long id);

}
