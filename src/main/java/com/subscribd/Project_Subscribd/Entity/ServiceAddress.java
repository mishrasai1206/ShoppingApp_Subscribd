package com.subscribd.Project_Subscribd.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ServiceAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serviceAddressId;
	private String serviceAddressArea;

}
