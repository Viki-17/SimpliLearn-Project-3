package com.shopping.SportsShoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.SportsShoes.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository <Category, Long> { 
	
	Category findByType(String type);

}