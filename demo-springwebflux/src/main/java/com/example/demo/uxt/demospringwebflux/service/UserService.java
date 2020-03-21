package com.example.demo.uxt.demospringwebflux.service;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

import com.example.demo.uxt.demospringwebflux.model.User;
@Component
public class UserService {

	@Value("${registration.service}") 
	private String registrationServiceBaseUrl;
	
	public Mono<User> addUser(User user) {
		 WebClient webClient = WebClient.builder().baseUrl(registrationServiceBaseUrl).build();
		 return  webClient.post()
        .uri("/register/add")
        .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE)
        .body(BodyInserters.fromObject(user))
        .retrieve()
        .bodyToMono(User.class);
	}
}
