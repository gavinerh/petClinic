package com.example.petClinic.services;

import java.util.Set;

import com.example.petClinic.model.Owner;

public interface OwnerService {

	Owner findByLastName(String lastname);
	
	Owner findById(Integer id);
		
	Owner save(Owner owner);
	
	Set<Owner> findAll();
}
