package com.buzzimonitor.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buzzimonitor.desafio.core.controller.BaseController;
import com.buzzimonitor.desafio.core.service.BaseService;
import com.buzzimonitor.desafio.model.Twitter;
import com.buzzimonitor.desafio.service.TwitterService;

@RestController
@RequestMapping("/twitter")
public class TwitterController extends BaseController<Twitter, String>{
	
	@Autowired
	public TwitterService postService;

	@Override
	public BaseService<Twitter, String> getService() {
		return postService;
	}
}
