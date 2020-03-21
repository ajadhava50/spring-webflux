package com.example.demo.uxt.demospringwebmvc;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class UserService {

	@Value("${registration.service}") 
	private String registrationServiceBaseUrl;
	
	public User addUser(User user) {
		
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<User> request = new HttpEntity<>(user);
		ResponseEntity<User> response = restTemplate.exchange(registrationServiceBaseUrl+"/register/add", HttpMethod.POST, request, User.class);
		return response.getBody();
	}
}
