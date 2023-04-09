package com.subscribd.Project_Subscribd.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.subscribd.Project_Subscribd.Config.ResponseStructure;
import com.subscribd.Project_Subscribd.DAO.AddressDao;
import com.subscribd.Project_Subscribd.Entity.Address;
import com.subscribd.Project_Subscribd.Exception.AddressNotFoundByIdException;

@Service
public class AddressService {
	@Autowired
	private AddressDao addressDao;

	public ResponseEntity<ResponseStructure<Address>> saveAddress(Address address) {
		ResponseStructure<Address> responseStructure = new ResponseStructure<>();
		addressDao.saveAddress(address);

		responseStructure.setStatus(HttpStatus.CREATED.value());
		responseStructure.setMessage("Address added Successfully");
		responseStructure.setData(address);
		return new ResponseEntity<ResponseStructure<Address>>(responseStructure, HttpStatus.CREATED);

	}

	public ResponseEntity<ResponseStructure<Address>> getAddress(int id) {
		ResponseStructure<Address> responseStructure = new ResponseStructure<>();
		Address address = addressDao.findAddressById(id);

		if (address != null) {
			responseStructure.setStatus(HttpStatus.FOUND.value());
			responseStructure.setMessage("Address Found");
			responseStructure.setData(address);
			return new ResponseEntity<ResponseStructure<Address>>(responseStructure, HttpStatus.FOUND);
		} else {
			throw new AddressNotFoundByIdException("Failed to find the Address!!");
		}
	}

	public ResponseEntity<ResponseStructure<Address>> UpdateAddress(Address address, int id) {
		ResponseStructure<Address> responseStructure = new ResponseStructure<>();
		Address address2 = addressDao.updateAddressById(address, id);

		if (address != null) {
			responseStructure.setStatus(HttpStatus.OK.value());
			responseStructure.setMessage("Address Updated!!");
			responseStructure.setData(address);
			return new ResponseEntity<ResponseStructure<Address>>(responseStructure, HttpStatus.OK);
		} else {
			throw new AddressNotFoundByIdException("Failed to Update Address!!");
		}
	}
	
	public ResponseEntity<ResponseStructure<Address>> deleteAddress(int id){
		ResponseStructure<Address> responseStructure = new ResponseStructure<>();
		Address address =  addressDao.deleteAddressById(id);
		
		if(address != null) {
			responseStructure.setStatus(HttpStatus.OK.value());
			responseStructure.setMessage("Address Deleted");
			responseStructure.setData(address);
		}
		else {
			throw new 
		}
	}

}
