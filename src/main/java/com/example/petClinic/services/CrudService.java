package com.example.petClinic.services;

import java.util.Set;

public interface CrudService<T, ID> {
	Set<T> findAll();
	T findById(ID id);
<<<<<<< HEAD
	T save(T t);
=======
	T save(T object);
	void delete(T object);
>>>>>>> fdeb9f9e79ee37f252a74eb141a3c45349de1f46
	void deleteById(ID id);
}
