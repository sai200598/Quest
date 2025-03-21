package Utlitypage;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Extentreportlistener implements ITestListener {
	private static ExtentReports extent = Report.getReportInstance();
	
	@Override
	 public void onTestStart(ITestResult result) {
        ExtentTest test = extent.createTest(result.getMethod().getMethodName());
     
    }

}
