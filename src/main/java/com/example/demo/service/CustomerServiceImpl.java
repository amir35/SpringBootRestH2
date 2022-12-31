package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepo;

	@Override
	public List<CustomerEntity> getAllCustomer() {
		return customerRepo.findAll();
	}

	@Override
	public CustomerEntity getCustomer(int cid) {
		Optional<CustomerEntity> customer = customerRepo.findById(cid);

		if(customer.isPresent())
		{
			return customer.get();
		}else
			return new CustomerEntity();
	}

	@Override
	public CustomerEntity postCustomer(CustomerEntity cust) {
		return customerRepo.save(cust);
	}

	@Override
	public CustomerEntity updateCustomer(CustomerEntity cust) {
		return customerRepo.save(cust);
	}

	@Override
	public String deleteCustomer(int cid) {
		customerRepo.deleteById(cid);
		return "Deleted";
	}

}
