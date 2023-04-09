package com.subscribd.Project_Subscribd.DTO;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class CustomerDto {
	private int customerId;
	private String customerName;
	private String customerEmail;
}
