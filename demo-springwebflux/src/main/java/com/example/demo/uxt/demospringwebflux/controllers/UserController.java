package com.example.demo.uxt.demospringwebflux.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

import com.example.demo.uxt.demospringwebflux.model.User;
import com.example.demo.uxt.demospringwebflux.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value="springwebflux-user/add",consumes = "application/json;charset=UTF-8",produces="application/json;charset=UTF-8")
	public Mono<User> addUser(@RequestBody User user){
		return userService.addUser(user);
		
		
		
	}
}
