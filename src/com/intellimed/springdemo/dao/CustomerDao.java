package com.intellimed.springdemo.dao;

import java.util.List;

import com.intellimed.springdemo.entity.Customer;

public interface CustomerDao {

	List<Customer>  getCustomers();

	void saveCustomer(Customer customer);

	Customer getCustomer(int id);

	void deleteCustomer(int id);
}
