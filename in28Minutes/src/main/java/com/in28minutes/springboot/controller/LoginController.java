package com.in28minutes.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.springboot.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/login")
	public String showLoginPage() {
		return "login";
	}
	
	@PostMapping("/login")
	public String showWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		boolean isValidUser = loginService.userValidate(name, password);
		if (isValidUser) {
			model.put("name", name);
			model.put("password", password);
			return "welcome";
		} else {
			model.put("errorMessage", "Incorrect user or password");
			return "login";
		}
	}

}
