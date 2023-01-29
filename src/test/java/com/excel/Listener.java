package com.excel;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Listener implements ITestListener {
	
	PrintTime printTime = new PrintTime();
	
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+ "Test Passed");
		test.log(Status.PASS, result.getName());
	}
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName());
		test.log(Status.FAIL, result.getName());
	}
	
	ExtentReports extent;
	
	public void onStart(ITestContext context) {
		String currentTime = printTime.getCurrentTime();
		
		System.out.println(context.getName()+ "Started");
		String ptReport = System.getProperty("/Users/reravich")+ "\\Reports\\";
		String rName = "Execution_"+ currentTime+ ".html";
		String fname = ptReport+rName;
		System.out.println(fname);
		ExtentHtmlReporter html = new ExtentHtmlReporter(fname);
		extent = new ExtentReports();
		extent.attachReporter(html);
		
	}
	
	ExtentTest test;
	
	public void onTestStart(ITestResult context) {
		System.out.println(context.getName()+"Starting");
		test= extent.createTest(context.getName());
		
	}
	public void onFinish(ITestContext context) {
		 System.out.println(context.getName()+" finished");
	        extent.flush();
	}
}
