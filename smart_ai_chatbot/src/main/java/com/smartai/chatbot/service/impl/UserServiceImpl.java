package com.smartai.chatbot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartai.chatbot.model.User;
import com.smartai.chatbot.repository.UserRepository;
import com.smartai.chatbot.service.UserService;
@Service
public class UserServiceImpl implements UserService {
   @Autowired
	private UserRepository userRepository;
	
	@Override
	public User registerUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(email);
	}

}

