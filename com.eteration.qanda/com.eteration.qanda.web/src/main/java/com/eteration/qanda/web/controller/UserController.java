package com.eteration.qanda.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eteration.qanda.models.User;
import com.eteration.qanda.services.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value = "/users", method= RequestMethod.GET)
	public List<User> getUsers() {
		return (List<User>) userRepository.findAll();
	}
	
	@RequestMapping(value = "/users/{username}", method= RequestMethod.GET)
	public List<User> findUser(@PathVariable String username) {
		return (List<User>) userRepository.findByUserName(username);
	}

}
