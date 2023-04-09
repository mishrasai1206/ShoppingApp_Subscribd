package com.subscribd.Project_Subscribd.DAO;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.subscribd.Project_Subscribd.Entity.Customer;
import com.subscribd.Project_Subscribd.Repo.CustomerRepo;

@Repository
public class CustomerDao {
	@Autowired
	private CustomerRepo customerRepo;

	public Customer saveCustomer(Customer customer) {
		return customerRepo.save(customer);
	}

	public Customer findCustomerById(int id) {
		return customerRepo.findById(id).get();
	}

	public Customer updateCustomerById(Customer customer, int id) {
		Optional<Customer> optional = customerRepo.findById(id);
		if (optional.isEmpty()) {
			return null;
		}
		customer.setCustomerId(id);
		return customerRepo.save(customer);
	}

	public Customer deleteCustomerById(int id) {
		Customer customer = customerRepo.findById(id).get();
		customerRepo.delete(customer);
		return customer;
	}
}
