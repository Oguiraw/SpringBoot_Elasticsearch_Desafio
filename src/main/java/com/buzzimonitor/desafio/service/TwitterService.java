package com.buzzimonitor.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buzzimonitor.desafio.core.repository.BaseRepository;
import com.buzzimonitor.desafio.core.service.BaseService;
import com.buzzimonitor.desafio.model.Twitter;
import com.buzzimonitor.desafio.repository.TwitterRepository;

@Service
public class TwitterService extends BaseService<Twitter, String> {
	
	@Autowired
	public TwitterRepository twitterRepo;

	@Override
	public BaseRepository<Twitter, String> getRepository() {
		return twitterRepo;
	}


	

}
