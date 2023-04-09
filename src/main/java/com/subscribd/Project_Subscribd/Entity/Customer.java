package com.subscribd.Project_Subscribd.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private int customerName;
	private int customerEmail;
	private int customerPassword;
	
	@OneToOne
	private Address address;
	
	@OneToMany
	private List<SubscriptionPurchased> subscriptionPurchased;

}
