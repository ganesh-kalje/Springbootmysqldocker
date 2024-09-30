package com.Springbootmysqldocker.Springbootmysqldocker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Springbootmysqldocker.Springbootmysqldocker.entity.Events;
import com.Springbootmysqldocker.Springbootmysqldocker.entity.Users;
import com.Springbootmysqldocker.Springbootmysqldocker.repo.UsersRepo;

@RestController
public class UsersController {
	@Autowired
	private UsersRepo usersRepo;
	
	@PostMapping("/register")
	public Users insert(@RequestBody Users users) {
		Events event = new Events();
		
		return usersRepo.save(users);
	}
}
