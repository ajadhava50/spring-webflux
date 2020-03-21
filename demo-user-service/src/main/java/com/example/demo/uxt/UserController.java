package com.example.demo.uxt;
import java.time.Duration;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class UserController {
	
	
	@PostMapping("/register/add")
	public Mono<Object> addUser(@RequestBody User user ) throws InterruptedException{
			System.out.println(user.toString());
			return Mono.create(sink ->sink.success(new User(user.getFirstName(),user.getLastName()))).delayElement(Duration.ofSeconds(1L));
	}
	
}
