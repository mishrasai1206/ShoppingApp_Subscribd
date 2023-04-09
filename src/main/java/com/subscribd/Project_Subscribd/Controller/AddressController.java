package com.subscribd.Project_Subscribd.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.subscribd.Project_Subscribd.Config.ResponseStructure;
import com.subscribd.Project_Subscribd.Entity.Address;
import com.subscribd.Project_Subscribd.Service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	private AddressService addressService;

	@PostMapping
	public ResponseEntity<ResponseStructure<Address>> saveAddress(@RequestBody Address address) {
		return addressService.saveAddress(address);

	}

	@GetMapping("/{addressId}")
	public ResponseEntity<ResponseStructure<Address>> getAddress(@RequestParam int addressId) {
		return addressService.getAddress(addressId);
	}
}
