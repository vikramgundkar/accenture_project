package resources;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;

	public static WebDriver InitializeBrowser() throws IOException, InterruptedException {
		

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Vikram\\eclipse-workspace\\Fresh\\src\\main\\java\\resources\\Data.properties");
		prop.load(fis);

		String URL = prop.getProperty("url");
		String BROWSER = prop.getProperty("browser");
		System.out.println(BROWSER);

		if (BROWSER.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Vikram\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
			driver = new ChromeDriver();

			// driver = WebDriverManager.chromedriver().create();
			driver.manage().window().maximize();
			driver.get(URL);
			Thread.sleep(10000);
		}

		if (BROWSER.equalsIgnoreCase("edge")) {
			driver = WebDriverManager.edgedriver().create();
			driver.manage().window().maximize();
			driver.get(URL);
		}

		if (BROWSER.equalsIgnoreCase("IE")) {
			driver = WebDriverManager.chromedriver().create();
			driver.manage().window().maximize();
			driver.get(URL);
		}

		return driver;

	}

	public static String getScreenshot(String testCaseName, WebDriver driver) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir") + testCaseName + ".png"));
		return System.getProperty("user.dir") + testCaseName + ".png";

	}
	
	public final  void PrintName(){
		
		System.out.println("Vikram");
		
	}

	@BeforeMethod(alwaysRun = true)
	public static void launchApplication() throws IOException, InterruptedException {
		//driver = InitializeBrowser();

	}

}
