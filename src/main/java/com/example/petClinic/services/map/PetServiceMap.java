package com.example.petClinic.services.map;

import java.util.Set;

import com.example.petClinic.model.Owner;
import com.example.petClinic.model.Pet;
import com.example.petClinic.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Integer> implements CrudService<Pet, Integer> {

	@Override
	public Pet save(Pet t) {
		return super.save(t.getId(), t);
	}
	
	@Override
	public Set<Pet> findAll(){
		return super.findAll();
	}
	
	@Override
	public Pet findById(Integer id) {
		return super.findById(id);
	}
	
	@Override
	public void delete(Pet owner) {
		super.delete(owner);
	}
	
	@Override
	public void deleteById(Integer id) {
		super.deleteById(id);
	}
	
}
