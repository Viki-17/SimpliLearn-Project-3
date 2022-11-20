package com.shopping.SportsShoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.SportsShoes.model.Customer;
import com.shopping.SportsShoes.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository aCustomerRepository;
	
	@Override
	public List<Customer> getAllCustomers(){
		
		return aCustomerRepository.findAll();
	}

	@Override
	public Customer getCustomerByEmail(String email) {
		Customer aAdmin = aCustomerRepository.findByEmail(email);
		// todo exception handling
		return aAdmin;
	}

	@Override
	public void saveCustomer(Customer aCust) {
		this.aCustomerRepository.save(aCust);
		
	}
	

}
