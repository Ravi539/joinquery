package com.springdatajpa.JoinQuery.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springdatajpa.JoinQuery.entity.User;
import com.springdatajpa.JoinQuery.repository.UserRepository;

@Service
public class UserService {

	 private final UserRepository userRepository;

	    public UserService(UserRepository userRepository) 
	    {
	        this.userRepository = userRepository;
	    }

	    public List<User> getUsersByRoleName(String name)
	    {
	        return userRepository.findByRoleName(name);
	    }
}
