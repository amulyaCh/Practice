package com.practice.firstrest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.firstrest.beans.User;
import com.practice.firstrest.services.UserService;

@RestController
public class UserController{
	
	@Autowired
	UserService userService;
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user ) {
		return userService.saveUser(user);
		
	}

}
