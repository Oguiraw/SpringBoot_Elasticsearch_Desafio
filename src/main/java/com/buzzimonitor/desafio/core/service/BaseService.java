package com.buzzimonitor.desafio.core.service;

import java.io.Serializable;

import org.springframework.data.domain.PageRequest;

import com.buzzimonitor.desafio.core.model.Model;
import com.buzzimonitor.desafio.core.repository.BaseRepository;

public abstract class BaseService <E extends Model<T>, T extends Serializable> {

	public abstract BaseRepository<E, T> getRepository();
	
	public E findOne(T id) {
		return getRepository().findOne(id);
	}
	
	public E save(E model) {
		return getRepository().save(model);
	}

	public void delete(E model) {
		getRepository().delete(model);
	}

	public Iterable<E> findAll(String usuario, int pagina) {
		return getRepository().findAll(usuario,new PageRequest(pagina, 20));
	}
	
	public Iterable<E> findAll(int pagina) {
		return getRepository().findAll(new PageRequest(pagina, 20));
	}
	
	public Iterable<E> findAll() {
		return getRepository().findAll();
	}
}
