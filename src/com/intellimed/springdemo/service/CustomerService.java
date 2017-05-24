package com.intellimed.springdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.intellimed.springdemo.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

}
