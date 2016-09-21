package com.usermanagement.dao;



import com.usermanagement.model.Role;

public interface RoleDao {
	
    
	
	Role findByCategory(String category);
	
	
}
