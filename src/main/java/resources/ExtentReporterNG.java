package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG extends Base{
	
	

	public static ExtentReports getReporterobject() {
		
		String path=System.getProperty("user.dir")+"target\\"+"index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Report");
		reporter.config().setDocumentTitle("Project Execution Report");
		
		ExtentReports extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Vikram Gundkar");
		return extent;
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		

		

		
		
	}

}
