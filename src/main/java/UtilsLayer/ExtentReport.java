package UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.Baseclass;

public class ExtentReport extends Baseclass{
	
	ExtentReport report;
	
	public static ExtentReports setUp(String ReportName) {
		
		String path=System.getProperty("user.dir")+"//ExtendReports//"+ReportName+date()+".html";
		
		ExtentSparkReporter esr=new ExtentSparkReporter(path);
		
		ExtentReports report = new ExtentReports();
		
		report.attachReporter(esr);
		
		return report;
			
	}

	public static String date() {
		return new SimpleDateFormat("ddMMyyyy__HHmmss").format(new Date());

	}
	
	public static String takesScreenShot(String foldername,String screenshot) throws IOException {
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String path =System.getProperty("user.dir")+"//"+foldername+"//"+screenshot+date()+".png";
		
		FileUtils.copyFile(f, new File(path));
		
		return screenshot;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
