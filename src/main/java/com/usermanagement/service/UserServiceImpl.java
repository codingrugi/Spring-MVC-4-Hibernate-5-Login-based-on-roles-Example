package com.usermanagement.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.usermanagement.dao.UserDao;
import com.usermanagement.model.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao dao;

	@Autowired
    private PasswordEncoder passwordEncoder;
	

	
	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		User user = dao.findByUsername(username);
		return user;
	}

	

}
