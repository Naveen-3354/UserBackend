package com.user.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.AliasRegistry;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class Controller {

	@Autowired
	Service service;
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		return service.userRegister(user);
	}
	
	@PostMapping("/login")
	public String userLogin(@RequestBody User user) {
		return service.userLogin(user);
	}
}
