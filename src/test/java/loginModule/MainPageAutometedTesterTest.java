package loginModule;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.MainPageAutometedTester;
import resources.Base;

public class MainPageAutometedTesterTest extends Base{

	
	
	
	@Test
	public static void LanguageSelection() throws IOException, InterruptedException {
		
		
		InitializeBrowser();
		
		
		MainPageAutometedTester main = new MainPageAutometedTester(driver);

		Thread.sleep(20000);
		//main.DeclineCookiesButton().click();
		main.AcceptCookiesButton().click();
	Thread.sleep(15000);
	
	
	
	
		
//		main.SelectlanguageIcon().click();
//		Thread.sleep(15000);
//		List<WebElement> Options = main.LanguageList();
//		
//		Iterator<WebElement> it = Options.iterator();
//		
//		for(WebElement option: Options)
//		{
//			if(option.getTagName().equalsIgnoreCase("Deutsch"))
//			{
//				option.click();
//				break;
//			}
//			
//		}
//		Thread.sleep(10000);
		
		
		SoftAssert sa=new SoftAssert();

	sa.assertEquals("True", "True");
		sa.assertEquals("True", "False");
		System.out.println("complete");
		

	}

	public static void main(String[] args) {
	
		Base b=new Base();
		b.PrintName();

	}

}
