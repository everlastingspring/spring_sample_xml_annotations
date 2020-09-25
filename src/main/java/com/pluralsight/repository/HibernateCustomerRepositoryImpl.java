package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;
import com.pluralsight.service.CustomerService;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	
	CustomerService service;
	
	HibernateCustomerRepositoryImpl(CustomerService service){
		this.service=service;
	}
	
	@Override
	public List<Customer> findAll(){
		
		List<Customer> customers=new ArrayList<Customer>();
		Customer customer= new Customer();
		customer.setFirstName("pavan");
		customer.setLastName("acharya");
		customers.add(customer);
		return customers;
	}
}
