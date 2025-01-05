package com.smartai.chatbot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartai.chatbot.model.User;
import com.smartai.chatbot.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@PostMapping("/register")
	public ResponseEntity<User> getUserEmail(@RequestBody User user){
		User savedUser = userService.registerUser(user);
		return new ResponseEntity<User>(savedUser, HttpStatus.CREATED);
	} 
	
	@GetMapping("/{email}")
	public ResponseEntity<User> getUserByEmail(@PathVariable String email){
		User user = userService.getUserByEmail(email);
		if (user!=null) {
			return new ResponseEntity<>(user, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(user, HttpStatus.NOT_FOUND);
		}
		
		
	}
	
}
