package com.subscribd.Project_Subscribd.DAO;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.subscribd.Project_Subscribd.Entity.Address;
import com.subscribd.Project_Subscribd.Repo.AddressRepo;

@Repository
public class AddressDao {
	@Autowired
	private AddressRepo addressRepo;

	public Address saveAddress(Address address) {
		return addressRepo.save(address);
	}

	public Address findAddressById(int id) {
		Optional<Address> optional = addressRepo.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}

	public Address updateAddressById(Address address, int id) {
		Optional<Address> optional = addressRepo.findById(id);
		if (optional.isEmpty()) {
			return null;
		}
		address.setAddressId(id);
		return addressRepo.save(address);
	}

	public Address deleteAddressById(int id) {
		Optional<Address> optional = addressRepo.findById(id);
		if (optional.isEmpty()) {
			return null;
		} else {
			Address address = optional.get();
			addressRepo.delete(address);
			return address;
		}
	}
}
