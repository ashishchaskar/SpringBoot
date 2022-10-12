package com.facebook.component;

import org.springframework.stereotype.Component;

@Component("excelreport")
public class ExcelReport implements IReport  {

	@Override
	public void generateReport() {
	
		System.out.println("Generating excel report...");
		
	}

}
