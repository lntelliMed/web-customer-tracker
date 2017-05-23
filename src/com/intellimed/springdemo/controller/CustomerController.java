package com.intellimed.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.intellimed.springdemo.dao.CustomerDao;
import com.intellimed.springdemo.entity.Customer;


@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerDao customerDao;

	@RequestMapping("/list")
	public String listCustomers(Model model){
		List<Customer> customers = customerDao.getCustomers();
		
		model.addAttribute("customers", customers);
		return "list-customers";
	}
}
