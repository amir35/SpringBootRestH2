package com.example.demo.controller;

import java.util.List;
import com.example.demo.entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.CustomerService;

@RestController
public class CourseController {

	@Autowired
	private CustomerRepository courseRepository;

	@Autowired
	private CustomerService customerService;

	@GetMapping("/home")
	public String welcome()
	{
		return "Welcome...";
	}
	
	@GetMapping("/customers")
	public List<CustomerEntity> getCourses()
	{
		return customerService.getAllCustomer();
	}
	
	@GetMapping("/customer/{cid}")
	public CustomerEntity getCourse(@PathVariable int cid)
	{

		return customerService.getCustomer(cid);
	}
	
	@PostMapping("/customer")
	public CustomerEntity addCourse(@RequestBody CustomerEntity customer)
	{

		return customerService.postCustomer(customer);
	}
	
	@PutMapping("/customer")
	public CustomerEntity updateCourse(@RequestBody CustomerEntity customer)
	{

		return customerService.updateCustomer(customer);
	}
	
	@DeleteMapping("/customer/{cid}")
	public String deleteCourse(@PathVariable int cid)
	{
		return customerService.deleteCustomer(cid);
	}
}
