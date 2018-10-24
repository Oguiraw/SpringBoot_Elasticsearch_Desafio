package com.buzzimonitor.desafio.core.controller;

import java.io.Serializable;
import java.util.Iterator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.buzzimonitor.desafio.core.model.Model;
import com.buzzimonitor.desafio.core.service.BaseService;

public abstract class BaseController <E extends Model<T>, T extends Serializable>{

	public abstract BaseService<E, T> getService();
	
	@GetMapping()
	public ResponseEntity<?> getAll(){
		Iterator<E> itens = getService().findAll().iterator();
		return new ResponseEntity<Iterator<E>>(itens, HttpStatus.OK);
	}
	
	@GetMapping(params = "page")
	public ResponseEntity<?> getAll(@RequestParam("page") int page){
		Iterator<E> itens = getService().findAll(page).iterator();
		return new ResponseEntity<Iterator<E>>(itens, HttpStatus.OK);
	}
	
	@GetMapping(path= "{usuario}" ,params = "page")
	public ResponseEntity<?> getAll(@RequestParam("page") int page, @PathVariable("usuario") String usuario){
		Iterator<E> itens = getService().findAll(usuario, page).iterator();
		return new ResponseEntity<Iterator<E>>(itens, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getOne(@PathVariable("id") T id){
		E item = getService().findOne(id);
		return new ResponseEntity<E>(item , HttpStatus.OK);
	}	 
}
 