package com.example.petClinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {
<<<<<<< HEAD

	protected Map<ID, T> map = new HashMap<ID, T>();
	
	Set<T> findAll(){
		return new HashSet<T>(map.values());
=======
	protected Map<ID, T> map = new HashMap<>();
	
	Set<T> findAll(){
		return new HashSet<>(map.values());
>>>>>>> fdeb9f9e79ee37f252a74eb141a3c45349de1f46
	}
	
	T findById(ID id) {
		return map.get(id);
	}
	
	T save(ID id, T object) {
<<<<<<< HEAD
		map.put(id,  object);
=======
		map.put(id, object);
>>>>>>> fdeb9f9e79ee37f252a74eb141a3c45349de1f46
		return object;
	}
	
	void deleteById(ID id) {
		map.remove(id);
	}
	
	void delete(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}
}
