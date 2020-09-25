package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
//	@Autowired
//	public CustomerServiceImpl(CustomerRepository customerRepository) {
//		System.out.println("constructor injecion");
//		this.customerRepository=customerRepository;
//	}
//
//	@Autowired
//	public void setCustomerRepository(CustomerRepository customerRepository) {
//		System.out.println("setter injection");
//		this.customerRepository = customerRepository;
//	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}