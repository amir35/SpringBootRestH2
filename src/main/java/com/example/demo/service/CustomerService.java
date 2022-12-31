package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.CustomerEntity;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

	List<CustomerEntity> getAllCustomer();

	CustomerEntity getCustomer(int cid);

	CustomerEntity postCustomer(CustomerEntity cust);

	CustomerEntity updateCustomer(CustomerEntity cust);

	String deleteCustomer(int parseInt);
	
		
}
