package com.webapp.studmark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.studmark.model.User;
import com.webapp.studmark.services.UserService;

@RestController
public class RestControllerC {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/")
	public String h()
	{
		return "This is home page";
	}
	
	@GetMapping("/saveuser")
	public String saveUser(@RequestParam String username,@RequestParam String firstname,@RequestParam String lastname,@RequestParam int age,@RequestParam String password)
	{
		User user=new User(username,firstname,lastname,age,password);
		userService.saveMyUser(user);
		return "User saved";
	}

}
