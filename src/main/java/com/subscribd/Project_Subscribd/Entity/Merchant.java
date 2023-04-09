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
public class Merchant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int merchantId;
	private String merchantName;
	private String merchantEmail;
	private String merchantPassword;
	private long merchantPhone;
	
	@OneToOne
	private Address address;
	
	@OneToMany
	private List<ServiceAddress> serviceAddresses;
	
	@OneToMany
	private List<Categories> categories;


}
