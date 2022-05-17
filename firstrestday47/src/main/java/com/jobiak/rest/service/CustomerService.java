package com.jobiak.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobiak.rest.model.Customer;
import com.jobiak.rest.repository.CustomerRepository;

@Service
public class CustomerService {
@Autowired
CustomerRepository repo;
public Customer addId(Customer cust1) {
	Customer ref=repo.save(cust1);
	return ref;
}
public Customer modifyName(Customer cust1) {
	// TODO Auto-generated method stub
	return repo.save(cust1);
}
public void removeId(Long id) {
	repo.deleteById(id);
	
}
public List<Customer> getAll() {
	// TODO Auto-generated method stub
	return repo.findAll();
}
public Optional<Customer> show(Long mid) {
	// TODO Auto-generated method stub
	return repo.findById(mid);
}


}
