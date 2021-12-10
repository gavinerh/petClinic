package com.example.petClinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.petClinic.model.Pet;
import com.example.petClinic.services.CrudService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Integer> implements CrudService<Pet, Integer> {

	@Override
	public Set<Pet> findAll(){
		return super.findAll();
	}

	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(), object);
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
