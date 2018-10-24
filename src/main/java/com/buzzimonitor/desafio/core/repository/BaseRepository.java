package com.buzzimonitor.desafio.core.repository;

import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.buzzimonitor.desafio.core.model.Model;

public interface BaseRepository<E extends Model<T>, T extends Serializable> extends ElasticsearchRepository<E, T> {
	
	Iterable<E> findAll();
	
	@Query("{\"bool\" : {\"must\" : {\"term\" : {\"author.name_searchable\" : \"?0\"}}}}")	
	Page<E> findAll(String name_searchable, Pageable pageable);	
}
