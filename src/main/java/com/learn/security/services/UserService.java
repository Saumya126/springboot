package com.learn.security.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.learn.security.models.User;
@Service

public class UserService {


	List<User> list = new ArrayList<>();
	
	

	public UserService() {
		
		list.add(new User("abc", "abc1", "abc@123"));
		list.add(new User("xyz", "xyz1", "xyz@123"));
	}

	/*
	 * public UserService() {
	 * 
	 * list.add(new User(username:"abc",Password:"abc",email:"abc@gmail.com"));
	 * list.add(new User(username:"xyz",Password:"abcxyz",email:"xyz@gmail.com")); }
	 */
	
	
	//get all users
	public List<User> getAllUsers(){
		return this.list;
		
	}
	
	//get Single User
	public User getUser(String username) {
		return (User) this.list.stream().filter((user)->user.getUsername().equals(username));
		
		
	
		
	}
	
	//add user
	public User addUser( User user) {
		 this.list.add(user);
		 return user;
	
	
	
	}
}
