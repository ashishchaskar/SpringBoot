package com.microsoft.repo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("userdao")

public class UserDaoImpl implements IUserDao {

	@Override
	public String findNameById(Integer userId) {
		
		
		return "virat";
	}

}
