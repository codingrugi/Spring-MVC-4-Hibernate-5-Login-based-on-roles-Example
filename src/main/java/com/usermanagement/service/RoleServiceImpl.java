package com.usermanagement.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.usermanagement.dao.RoleDao;
import com.usermanagement.model.Role;

@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	RoleDao dao;
	

	public Role findByCategory(String category){
		return dao.findByCategory(category);
	}


}
