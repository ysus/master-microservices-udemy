package com.in28minutes.rest.webservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	@Autowired
	private UserDaoService  service;
	
	public List<User> retriveAllUsers(){
		return null
	}

}
