package com.jobiak.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobiak.rest.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

	
}
