package com.shopping.SportsShoes.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.shopping.SportsShoes.model.Product;
import com.shopping.SportsShoes.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository aProductRepository;
	
	@Override
	public List<Product> getAllProducts(){
		
		return aProductRepository.findAll();
	}

	@Override
	public void saveProduct(Product aProduct) {
		Date aExpDate = aProduct.getDateOfExpiry();
		aProduct.setDateOfExpiry(aExpDate);
		
		Date aManDate = aProduct.getDateofManufature();
		aProduct.setDateOfExpiry(aManDate);
		
		this.aProductRepository.save(aProduct);
		
	}

	@Override
	public Product getProductById(long id) {
		Optional <Product> optional = aProductRepository.findById(id);
		Product aProduct = null;
		if (optional.isPresent()) {
			aProduct = optional.get();
		} else {
			throw new RuntimeException(" Product not found for id : " + id);
		}
		return aProduct;
	}

	@Override
	public void deleteProductById(long id) {
		this.aProductRepository.deleteById(id);
	}

	@Override
	public List<Product> getProductsByType(String type) {
		return this.aProductRepository.findByCatType(type);
	}
	
}
