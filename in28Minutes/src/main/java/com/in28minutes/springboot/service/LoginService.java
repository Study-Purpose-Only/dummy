package com.in28minutes.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean userValidate(String name, String password) {
		return name.equalsIgnoreCase("in28minutes") && password.equalsIgnoreCase("dummy");
	}

}
