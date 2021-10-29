package com.example.service.Impl;

import org.springframework.stereotype.Service;

import com.example.service.ServiceClass;

@Service
public class ServiceImpl implements ServiceClass {

	@Override
	public String getHome() {
		return "hello world";
	}

}
