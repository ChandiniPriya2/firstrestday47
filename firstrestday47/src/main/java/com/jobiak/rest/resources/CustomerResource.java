package com.jobiak.rest.resources;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobiak.rest.model.Customer;
import com.jobiak.rest.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerResource {
	
	
@GetMapping(value="/custom",produces=MediaType.APPLICATION_JSON_VALUE)
public Customer showCatalog() {
Customer cust=new Customer();
cust.setId(501L);
cust.setName("Alfred");
cust.setBalance(488888);
return cust;
}
@GetMapping("/intro")
public String introduction() {
	return new String("The Api for customer relationships");
}
@GetMapping("/search/{custId}")
public String searchCustId(@PathVariable(value="custId") String custId) {
	return new String(custId+"is available in database");
}
@GetMapping("/search/{custId}/{name}")
public String searchName(@PathVariable Long custId ,@PathVariable String name) {
	return custId+"is the employee "+name+" is available " ;
}
@Autowired 
CustomerService service;
@CrossOrigin(origins= {"*"},maxAge=4800,allowCredentials="false")
@PostMapping(value="/create",consumes= MediaType.APPLICATION_JSON_VALUE,produces= MediaType.APPLICATION_JSON_VALUE)
public Customer addId(@RequestBody Customer cust1) {
	//System.out.println(mobile);
	Customer ref=service.addId(cust1);
	return ref;
}
@CrossOrigin(origins= {"*"},maxAge=4800,allowCredentials="false")
@PutMapping(value="/modify",consumes= MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
public Customer modifyName(@RequestBody Customer cust1) {
	Customer ref=service.modifyName(cust1);
	return ref;
}
@CrossOrigin(origins= {"*"},maxAge=4800,allowCredentials="false")
@DeleteMapping("/remove/{id}")
public void removeId(@PathVariable Long id) {
	service.removeId(id);
}
@CrossOrigin(origins= {"*"},maxAge=4800,allowCredentials="false")
@GetMapping(value="/display",produces= MediaType.APPLICATION_JSON_VALUE)
public List<Customer>showAll(){
	return service.getAll();
}

@GetMapping(value="/identify/{id}",produces= MediaType.APPLICATION_JSON_VALUE)
public Optional<Customer> showAll(@PathVariable Long id){
	return service.show(id);
}

}
