package com.example.petClinic.services;

import java.util.Set;

import com.example.petClinic.model.Pet;

public interface PetService {

	Pet findById(Integer id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
}
