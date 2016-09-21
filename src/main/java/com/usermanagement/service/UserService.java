package com.usermanagement.service;



import com.usermanagement.model.User;

public interface UserService {
	
	User findByUsername(String username);


}
