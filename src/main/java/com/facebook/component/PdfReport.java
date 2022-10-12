package com.facebook.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pdfreport")
@Primary
public class PdfReport implements IReport{

	@Override
	public void generateReport() {
		
		System.out.println("Generating pdf report...");
		
	}

}
