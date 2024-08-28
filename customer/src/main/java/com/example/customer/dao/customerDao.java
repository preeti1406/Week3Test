package com.example.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.customer.model.Customer;

@Repository
public interface customerDao extends JpaRepository<Customer,Integer> {

}
