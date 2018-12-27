package com.example.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.User;
import com.example.repositories.UserRepository;
import com.example.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	public Optional<User> findByEmail(String email) {
		return Optional.ofNullable(this.userRepository.findByEmail(email));
	}
}
