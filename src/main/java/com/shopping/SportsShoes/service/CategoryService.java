package com.shopping.SportsShoes.service;

import java.util.List;

import com.shopping.SportsShoes.model.Category;

public interface CategoryService {
	
	List<Category> getAllCategorys();
	void saveCategory(Category aCategory);
	Category getCategoryById(long id);
	Category getCategorytByType(String Type);
	
}

