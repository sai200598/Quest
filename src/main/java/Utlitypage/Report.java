package Utlitypage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {
	public static void main(String[] args) {
		ExtentReports extentreports = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\Nikhitha\\eclipse-workspace\\Qust\\Reports\\reports.html");
        
		extentreports.attachReporter(spark);
		extentreports.flush();
	}

	public static ExtentReports getReportInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
