package com.smartai.chatbot.service;

import com.smartai.chatbot.model.User;

public interface UserService {

	User registerUser(User user);
	User getUserByEmail(String email);
	
	
}
