package com.intellimed.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.intellimed.springdemo.dao.CustomerDao;
import com.intellimed.springdemo.entity.Customer;


@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerDao customerDao;

	//@RequestMapping("/list")
	//@RequestMapping(path="/list", method=RequestMethod.GET)
	@GetMapping("/list")
	public String listCustomers(Model model){
		List<Customer> customers = customerDao.getCustomers();
		
		model.addAttribute("customers", customers);
		return "list-customers";
	}
}
