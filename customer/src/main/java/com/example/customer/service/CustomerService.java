
package com.example.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customer.dao.customerDao;
import com.example.customer.model.Customer;


@Service
public class CustomerService {
@Autowired
customerDao customerdao;
public String addCustomer(Customer c1)
{
	customerdao.save(c1);
	return "New Customer created successfully";
}
public List<Customer> DisplayCustomer()
{
List<Customer> list=customerdao.findAll();
	return list;
}
public Customer updateCustomer(int id,Customer c2)
{
	Customer c3=customerdao.findById(id).get();
	if(c3!=null)
	{
		c3.setPassword(c2.getPassword());
		customerdao.save(c2);
	}
	return customerdao.findById(id).get();
}

public String deleteCustomer(int id)
{
	Customer c3=customerdao.findById(id).get();
	if(c3!=null)
	{
		customerdao.deleteById(id);
	}
	return "Deleted";
}
}
