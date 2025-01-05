package com.smartai.chatbot.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="chat_history")
public class ChatHistory {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
    
    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;
    
    private String messege;
    private String response;
    private String timestamp;
    
}
