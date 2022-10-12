package com.microsoft.repo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//loose coupling
@Repository
@Primary
public class NovaUserDaoImple implements IUserDao {

	@Override
	
	public String findNameById(Integer userId) {
		
		return "Sachin";
	}

}
