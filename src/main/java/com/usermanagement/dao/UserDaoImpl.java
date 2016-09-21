package com.usermanagement.dao;




import org.hibernate.Hibernate;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.usermanagement.model.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {
	
	static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
	
	public UserDaoImpl(){
		setClazz(User.class );
		}
	
	
	
	
	@SuppressWarnings("rawtypes")
	public User findByUsername(String username) {
		logger.info("username : {}", username);
		Query query = getCurrentSession().createQuery("from User where username= :username");
		query.setParameter("username", username);
		User user = (User)query.getSingleResult();
		if(user!=null){
			Hibernate.initialize(user.getUserRoles());
		}
		return user;
	}



}
