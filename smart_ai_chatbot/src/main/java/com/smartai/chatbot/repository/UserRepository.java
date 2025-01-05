package com.smartai.chatbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartai.chatbot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
