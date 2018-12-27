package com.example.services;

import java.util.Optional;

import com.example.entities.User;

public interface UserService {

	Optional<User> findByEmail(String email);
}
