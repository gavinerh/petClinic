package com.example.petClinic.services;

import java.util.Set;

import com.example.petClinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Integer> {

	Owner findByLastName(String lastname);
<<<<<<< HEAD
=======

>>>>>>> fdeb9f9e79ee37f252a74eb141a3c45349de1f46
}
