package com.example.petClinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.petClinic.model.Vet;
import com.example.petClinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Integer> implements VetService {

	@Override
	public Set<Vet> findAll(){
		return super.findAll();
	}

	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}
	
	@Override
	public Vet findById(Integer id) {
		return super.findById(id);
	}
	
	@Override
	public void delete(Vet owner) {
		super.delete(owner);
	}
	
	@Override
	public void deleteById(Integer id) {
		super.deleteById(id);
	}
}
