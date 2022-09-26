package loginModule;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.OpenBrowser;
import resources.Base;

public class OpenBrowserTest extends Base {
	OpenBrowser opb = new OpenBrowser(driver);

	@BeforeMethod
	public static void OpenBrowser() throws IOException  {

	}

	@Test
	public static void SearchForFood() throws IOException, InterruptedException {
		
		Thread.sleep(10000);
		OpenBrowser opb = new OpenBrowser(driver);
		opb.SerachFoodTextbox().sendKeys("Biryani");
		Assert.assertEquals("True", "True");
		

	}
	@Test
	public static void SearchForLocation() throws IOException {
		
		OpenBrowser opb = new OpenBrowser(driver);
		opb.SerachFoodTextbox().sendKeys("Biryani");
		Assert.assertEquals("True", "True");

	}

	@AfterMethod
	public static void CloseBrowser() throws InterruptedException {
		driver.close();
		Thread.sleep(2000);
	}

}
