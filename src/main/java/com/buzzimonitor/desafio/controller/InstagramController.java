package com.buzzimonitor.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buzzimonitor.desafio.core.controller.BaseController;
import com.buzzimonitor.desafio.core.service.BaseService;
import com.buzzimonitor.desafio.model.Instagram;
import com.buzzimonitor.desafio.service.InstagramService;

@RestController
@RequestMapping("/instagram")
public class InstagramController extends BaseController<Instagram, String>{
	
	@Autowired
	public InstagramService instaService;

	@Override
	public BaseService<Instagram, String> getService() {
		return instaService;
	}
}
