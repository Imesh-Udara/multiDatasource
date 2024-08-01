package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.db1.model.User;
import com.example.demo.db1.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	
	public User saveUser(User user) {
		return userRepo.save(user);
	}

}
