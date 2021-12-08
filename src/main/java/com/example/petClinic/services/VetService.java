package com.example.petClinic.services;

import java.util.Set;

import com.example.petClinic.model.Vet;

public interface VetService {

	Vet findById(Integer id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
}
