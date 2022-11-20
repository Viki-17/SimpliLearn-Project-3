package com.shopping.SportsShoes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.SportsShoes.model.Category;
import com.shopping.SportsShoes.repository.CategoryRepository;


@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired 
	private CategoryRepository aCategoryRepository;
	
	@Override
	public List<Category> getAllCategorys(){
		
		return aCategoryRepository.findAll();
	}

	@Override
	public void saveCategory(Category aCategory) {
		this.aCategoryRepository.save(aCategory);	
	}

	@Override
	public Category getCategoryById(long id) {
		Optional <Category> optional = aCategoryRepository.findById(id);
		Category aCategory = null;
		if (optional.isPresent()) {
			aCategory = optional.get();
		} else {
			throw new RuntimeException(" Product not found for id : " + id);
		}
		return aCategory;
	}

	@Override
	public Category getCategorytByType(String Type) {
		
		return aCategoryRepository.findByType(Type);
	}
	
	

	
	
}