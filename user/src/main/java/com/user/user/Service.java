package com.user.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	IRepository repo;
	
	public String userRegister(User user) {
		repo.save(user);
		return "Added";
	}
	
	public String userLogin(User user) {
		List<User> list = repo.findAll();
		String status = "Fail";
		for(User users :list) {
			if(users.getUserName().equals(user.getUserName())) {
				if(users.getPassword().equals(user.getPassword())) {
					status= "Success";
				}else {
					status="Fail";
				}
				
			}else {
				status="Fail";
			}
		}
		return status;
		
	}
}
