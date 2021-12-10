package com.example.petClinic.services.map;

import java.util.Set;

import com.example.petClinic.model.Vet;
import com.example.petClinic.services.CrudService;

public class VetService extends AbstractMapService<Vet, Integer> implements CrudService<Vet, Integer>{

	@Override
	public Vet save(Vet t) {
		return super.save(t.getId(), t);
	}
	
	@Override
	public Set<Vet> findAll(){
		return super.findAll();
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
