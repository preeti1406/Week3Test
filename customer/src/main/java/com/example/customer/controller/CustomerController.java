package com.example.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.model.Customer;
import com.example.customer.service.CustomerService;



@RestController
public class CustomerController {
@Autowired
CustomerService customerservice;
@PostMapping("/customer")
public String addCustomer(@RequestBody Customer c1)
{
	String po=customerservice.addCustomer(c1);
	return po;
}

@GetMapping("/customer")
public List<Customer> getCustomer()
{
	return customerservice.DisplayCustomer();
}
@PutMapping("/customer/{cid}")
public Customer updateCustomer(@PathVariable Integer cid,@RequestBody Customer c1)
{
	return customerservice.updateCustomer(cid,c1);
}
@DeleteMapping("/customer/{cid}")
public String delCustomer(@PathVariable Integer cid)
{
	return customerservice.deleteCustomer(cid);
}


}
