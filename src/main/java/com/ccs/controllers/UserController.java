package com.ccs.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccs.model.User;
import com.ccs.services.UserService;


@RestController
@RequestMapping("/user")
public class UserController {

	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/getUsers")
	public List<User> findAll() {
		return this.userService.findAll();
		
	}

	@PostMapping("/save")
	public User save(@RequestBody User user) {
		System.out.println(user);
		return this.userService.save(user);
		
	}
	
}
