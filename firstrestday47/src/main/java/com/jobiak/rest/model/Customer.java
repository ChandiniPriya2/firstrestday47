package com.jobiak.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue
private Long id;
private String name;
private double balance;

public Customer() {
	// TODO Auto-generated constructor stub
}

public Customer(Long id, String name, double balance) {
	super();
	this.id = id;
	this.name = name;
	this.balance = balance;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", balance=" + balance + "]";
}



}
