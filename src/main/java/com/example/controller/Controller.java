package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.ServiceClass;

@RestController
public class Controller {

	@Autowired
	private ServiceClass service;

	@GetMapping("/")
	public String getHome() {
		return service.getHome();
	}

	@PostMapping("/response")
	public String getHomeId(@RequestBody String id) {
		return "hello id:-" + id;
	}
}
