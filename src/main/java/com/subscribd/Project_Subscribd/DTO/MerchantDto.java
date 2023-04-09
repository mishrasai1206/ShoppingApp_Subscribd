package com.subscribd.Project_Subscribd.DTO;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class MerchantDto {
	private int merchantId;
	private String merchantName;
	private String merchantEmail;
}
