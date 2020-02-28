package com.kudla.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kudla.entities.User;
import com.kudla.repositories.UserRepository;

@RestController
public class UserService {

	@Autowired
	private UserRepository repo;
	
	@PostMapping("/register")
	public void save(@RequestBody User user) {
		repo.save(user);
	}
	
}