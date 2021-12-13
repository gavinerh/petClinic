package com.example.petClinic.services.map;

import java.util.Set;

<<<<<<< HEAD
import com.example.petClinic.model.Owner;
import com.example.petClinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Integer> implements CrudService<Owner, Integer> {

	@Override
	public Owner save(Owner t) {
		return super.save(t.getId(), t);
	}
	
=======
import org.springframework.stereotype.Service;

import com.example.petClinic.model.Owner;
import com.example.petClinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Integer> implements OwnerService {
>>>>>>> fdeb9f9e79ee37f252a74eb141a3c45349de1f46
	@Override
	public Set<Owner> findAll(){
		return super.findAll();
	}
<<<<<<< HEAD
=======

	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}
>>>>>>> fdeb9f9e79ee37f252a74eb141a3c45349de1f46
	
	@Override
	public Owner findById(Integer id) {
		return super.findById(id);
	}
	
	@Override
	public void delete(Owner owner) {
		super.delete(owner);
	}
	
	@Override
	public void deleteById(Integer id) {
		super.deleteById(id);
	}

<<<<<<< HEAD
=======
	@Override
	public Owner findByLastName(String lastname) {
		return null;
	}
	
>>>>>>> fdeb9f9e79ee37f252a74eb141a3c45349de1f46
}
