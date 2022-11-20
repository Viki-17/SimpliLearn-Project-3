package com.shopping.SportsShoes.service;

import java.util.List;

import com.shopping.SportsShoes.model.Customer;



public interface CustomerService {
	List<Customer> getAllCustomers();
	Customer getCustomerByEmail(String email);
	void saveCustomer(Customer aCust);
}
