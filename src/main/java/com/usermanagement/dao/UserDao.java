package com.usermanagement.dao;


import com.usermanagement.model.User;

public interface UserDao {
	
	
  
	
	User findByUsername(String username);
	
	

}
