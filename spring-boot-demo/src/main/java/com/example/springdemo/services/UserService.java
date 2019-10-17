package com.example.springdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.repositories.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	public String getLoginUser(String name,  String password) {
		String userType="error";
		userType=userRepository.loginUser(name, password);
		return userType;
	}
}
