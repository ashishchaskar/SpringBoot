package com.facebook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.facebook.component.IReport;

@Service
public class ReportService {

	private IReport report;

	@Autowired
	
	public ReportService(@Qualifier("excelreport") IReport report) {

		System.out.println("performing constructor base injection..");

		this.report = report;

		System.out.println("Injected bean : " + report.getClass().getName());

	}

	public void downloadReport() {

		report.generateReport();

	}

}
