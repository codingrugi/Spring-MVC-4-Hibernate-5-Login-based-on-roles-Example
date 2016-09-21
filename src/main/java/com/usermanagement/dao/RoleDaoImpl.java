package com.usermanagement.dao;




import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.usermanagement.model.Role;

@Repository("roleDao")
public class RoleDaoImpl extends AbstractDao<Integer, Role>implements RoleDao {
	

	
	public RoleDaoImpl(){
		setClazz(Role.class);
		}


	@SuppressWarnings("rawtypes")
	@Override
	public Role findByCategory(String category) {
		Query query = getCurrentSession().createQuery("from Role where category= :categotry");
		query.setParameter("category", category);
		return (Role) query.getSingleResult();
	}


}
