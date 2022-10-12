package com.microsoft.repo;

import org.springframework.stereotype.Repository;

@Repository
public class SuperUserDaoImpl implements IUserDao {

	@Override
	public String findNameById(Integer userId) {
		
		return "Rohit";
	}

}
