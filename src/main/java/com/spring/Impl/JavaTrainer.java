package com.spring.Impl;

import com.spring.dao.Message;

public class JavaTrainer implements Message {

	private String name;
	private String message;
	
	
	@Override
	public void giveMessage() {
		System.out.println(name+" says: "+message);
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
