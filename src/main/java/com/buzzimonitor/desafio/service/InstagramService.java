package com.buzzimonitor.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buzzimonitor.desafio.core.service.BaseService;
import com.buzzimonitor.desafio.model.Instagram;
import com.buzzimonitor.desafio.repository.InstagramRepository;

@Service
public class InstagramService extends BaseService<Instagram, String> {
	
	@Autowired
	public InstagramRepository instaRepo;

	@Override
	public InstagramRepository getRepository() {
		return instaRepo;
	}


	

}
