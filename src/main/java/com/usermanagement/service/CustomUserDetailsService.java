package com.usermanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.usermanagement.model.Role;
import com.usermanagement.model.User;



@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private UserService userService;
	
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		User user = userService.findByUsername(username);
		System.out.println("User : "+username);
		if(user==null){
			System.out.println("User not found");
			throw new UsernameNotFoundException("Username not found"); 
		}
			return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), 
				 user.getRecogonize().equals("Active"), true, true, true, getGrantedAuthorities(user));
	}

	
	private List<GrantedAuthority> getGrantedAuthorities(User user){
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
		for(Role role : user.getUserRoles()){
			System.out.println("Role : "+role);
			authorities.add(new SimpleGrantedAuthority(role.getCategory()));
		}
		System.out.print("authorities :"+authorities);
		return authorities;
	}
	
}
