package com.springdatajpa.JoinQuery.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springdatajpa.JoinQuery.entity.User;
import com.springdatajpa.JoinQuery.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	 private final UserService userService;

	    public UserController(UserService userService) {
	        this.userService = userService;
	    }

	    @GetMapping("/search")
	    public List<User> getUsersByRoleName(@RequestParam("name") String name) 
	    {
	        return userService.getUsersByRoleName(name);
	    }
}
