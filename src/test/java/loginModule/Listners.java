package loginModule;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.Base;
import resources.ExtentReporterNG;

public class Listners extends Base implements ITestListener {

	public static void main(String[] args) {

	}

	
	
	ExtentReports extent=ExtentReporterNG.getReporterobject();
	ExtentTest test;
	
	public void onTestStart(ITestResult result) {

		String testCaseName = result.getMethod().getMethodName();
		

		
		extent.createTest(testCaseName);
		System.out.println("Starting");
		

	}

	public void onTestSuccess(ITestResult result) {

		
		test.log(Status.PASS, "This test is passed");

	}

	public void onTestFailure(ITestResult result) {
		//test.fail(result.getThrowable());

		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String filePath = null;
		String testCaseName = result.getMethod().getMethodName();
		try {
			filePath = getScreenshot(testCaseName, driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//test.addScreenCaptureFromPath(filePath, result.getMethod().getMethodName());

	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {
	extent.flush();
	System.out.println("Finished");
		//driver.close();

	}

}
