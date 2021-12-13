package com.example.petClinic.services.map;

import java.util.Set;

<<<<<<< HEAD
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
=======
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
>>>>>>> fdeb9f9e79ee37f252a74eb141a3c45349de1f46
	
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
<<<<<<< HEAD
	
=======
>>>>>>> fdeb9f9e79ee37f252a74eb141a3c45349de1f46
}
