package com.microsoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.microsoft.repo.IUserDao;

@Service
public class UserService {

	private IUserDao userDao;
	
	@Autowired
	
	public void setUserDao(IUserDao userdao) {
	
	System.out.println("setter method is called..");	
		this.userDao=userdao;
	System.out.println("Injected bean is : " + userDao.getClass().getName());	
		
	}
	
	public void getName(Integer id) {
		
		String name = userDao.findNameById(id);
		
		System.out.println("Name is >>" + name);
	}
	
}
