package com.example.demo.uxt.demospringwebmvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value="springmvc-user/add",consumes = "application/json;charset=UTF-8",produces="application/json;charset=UTF-8")
	public User addUser(@RequestBody User user){
		return userService.addUser(user);
		
	}
}
