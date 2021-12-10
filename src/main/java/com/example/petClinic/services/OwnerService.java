package com.example.petClinic.services;

import java.util.Set;

import com.example.petClinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Integer> {

	Owner findByLastName(String lastname);

}
