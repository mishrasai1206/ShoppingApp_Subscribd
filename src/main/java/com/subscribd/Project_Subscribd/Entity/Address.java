package com.subscribd.Project_Subscribd.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	private int addressFlatno;
	private String addressArea;
	private String addressLandmark;
	private String addressCity;
	private String addressState;

}
