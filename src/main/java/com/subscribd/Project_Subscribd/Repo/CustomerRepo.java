package com.subscribd.Project_Subscribd.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subscribd.Project_Subscribd.Entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
