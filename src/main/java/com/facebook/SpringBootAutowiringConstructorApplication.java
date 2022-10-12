package com.facebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.facebook.service.ReportService;

@SpringBootApplication
public class SpringBootAutowiringConstructorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootAutowiringConstructorApplication.class, args);
	
		ReportService bean = context.getBean(ReportService.class);
	
		bean.downloadReport();
	}

}
