package com.microsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.microsoft.service.UserService;

@SpringBootApplication
public class SpringBootAutowiringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootAutowiringApplication.class, args);
	
	     UserService bean = context.getBean(UserService.class);
	     
	     bean.getName(101);
	     
	}

}
