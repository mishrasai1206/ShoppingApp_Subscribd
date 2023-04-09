package com.subscribd.Project_Subscribd.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.handler.ResponseStatusExceptionHandler;

import com.subscribd.Project_Subscribd.Config.ResponseStructure;

@RestControllerAdvice
public class SubscribdExceptionHandler extends ResponseStatusExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> addressNotFoundById(AddressNotFoundByIdException ex) {
		ResponseStructure<String> responseStructure = new ResponseStructure<>();
		responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
		responseStructure.setMessage(ex.getMessage());
		responseStructure.setData("Failed to find the Address with the given ID!!");
		return new ResponseEntity<ResponseStructure<String>>(responseStructure,HttpStatus.NOT_FOUND);
	}
}
