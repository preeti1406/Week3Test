package com.example.customer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
@Id
int c_id;
String name;
String username;
String password;
public Customer()
{
	
}
public int getC_id() {
	return c_id;
}
public void setC_id(int c_id) {
	this.c_id = c_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Customer(int c_id, String name, String username, String password) {
	super();
	this.c_id = c_id;
	this.name = name;
	this.username = username;
	this.password = password;
}
@Override
public String toString() {
	return "Customer [c_id=" + c_id + ", name=" + name + ", username=" + username + ", password=" + password + "]";
}

}
