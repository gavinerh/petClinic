package com.example.petClinic.services.map;

import java.util.Set;

import com.example.petClinic.model.Owner;
import com.example.petClinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Integer> implements CrudService<Owner, Integer> {
	@Override
	public Set<Owner> findAll(){
		return super.findAll();
	}

	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}
	
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
	
}
