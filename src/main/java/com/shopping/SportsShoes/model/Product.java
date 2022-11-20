package com.shopping.SportsShoes.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table (name = "product")

public class Product {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long 	Id;
		
		private String	shortName;
		private String 	description;
		private String 	manufacturedBy;
		private Float 	price;
		private Float 	size;
		private String 	color;
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private Date	dateofManufature;
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private Date	dateOfExpiry;
		private String 	catType;
		
		
		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		@OneToOne(cascade=CascadeType.DETACH)
		private Category category;
		

		public Category getCategory() {
			return category;
		}

		public void setCategory(Category category) {
			this.category = category;
		}

		public long getId() {
			return Id;
		}

		public void setId(long id) {
			Id = id;
		}

		public String getShortName() {
			return shortName;
		}

		public void setShortName(String shortName) {
			this.shortName = shortName;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getManufacturedBy() {
			return manufacturedBy;
		}

		public void setManufacturedBy(String manufacturedBy) {
			this.manufacturedBy = manufacturedBy;
		}

		public Float getPrice() {
			return price;
		}

		public void setPrice(Float price) {
			this.price = price;
		}

		public Float getSize() {
			return size;
		}

		public void setSize(Float size) {
			this.size = size;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public Date getDateofManufature() {
			return dateofManufature;
		}

		public void setDateofManufature(Date dateofManufature) {
			this.dateofManufature = dateofManufature;
		}

		public Date getDateOfExpiry() {
			return dateOfExpiry;
		}

		public void setDateOfExpiry(Date dateOfExpiry) {
			this.dateOfExpiry = dateOfExpiry;
		}

		public String getCatType() {
			return catType;
		}

		public void setCatType(String catType) {
			this.catType = catType;
		}

		@Override
		public String toString() {
			return "Product [Id=" + Id + ", shortName=" + shortName + ", description=" + description
					+ ", manufacturedBy=" + manufacturedBy + ", price=" + price + ", size=" + size + ", color=" + color
					+ ", dateofManufature=" + dateofManufature + ", dateOfExpiry=" + dateOfExpiry + ", catType="
					+ catType + ", category=" + category + "]";
		}
		
		
		
}
