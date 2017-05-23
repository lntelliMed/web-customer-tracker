package com.intellimed.springdemo.dao;

import java.util.List;

import com.intellimed.springdemo.entity.Customer;

public interface CustomerDao {

	List<Customer>  getCustomers();
}
