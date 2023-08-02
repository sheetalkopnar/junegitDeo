package UtilsLayer;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import BaseLayer.Baseclass;

public class ListenerClass extends Baseclass  implements ITestListener{
	
	ExtentReports reports;
	ExtentTest extTest;
	
	@Override
	public void onStart(ITestContext context) {
		reports=ExtentReport.setUp(context.getSuite().getName());
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		extTest=reports.createTest("This is testcase"+result.getMethod().getMethodName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		extTest.log(Status.PASS, "Test case is pass"+result.getMethod().getMethodName());
		try {
			extTest.addScreenCaptureFromPath(ExtentReport.takesScreenShot("PassScreenshot", result.getMethod().getMethodName()));
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		extTest.log(Status.FAIL, "Test case is fail"+result.getMethod().getMethodName());
		try {
			extTest.addScreenCaptureFromPath(ExtentReport.takesScreenShot("FailScreenshot", result.getMethod().getMethodName()));
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		extTest.log(Status.SKIP, "Test is skip"+result.getMethod().getMethodName());
	}
	
	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
	}
	
	
	

}
