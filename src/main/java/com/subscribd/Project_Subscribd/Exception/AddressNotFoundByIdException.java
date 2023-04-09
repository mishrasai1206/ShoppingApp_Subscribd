package com.subscribd.Project_Subscribd.Exception;

import lombok.Data;

@Data
public class AddressNotFoundByIdException extends RuntimeException {
	private String message;

	public AddressNotFoundByIdException(String message) {
		this.message = message;
	}
}
