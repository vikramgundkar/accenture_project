package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MainPageAutometedTester {

	public WebDriver driver;

	public MainPageAutometedTester(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(linkText = "Selenium Automation Testing")
	WebElement seleniumutomationTesting;

	By declinecookies= By.id("hs-eu-decline-button");
	
	public WebElement DeclineCookiesButton() {
		return driver.findElement(declinecookies);
		
	}
	
	By acceptcookies=By.xpath("//div[@id='hs-eu-cookie-confirmation-button-group']/a");
	
	public WebElement AcceptCookiesButton() {
		
		return driver.findElement(acceptcookies);
		
	}
	
	
	By softwarebutton=By.xpath("//div[@id='burger-submenu']/ul/li[1]/div");
	
	
	public WebElement SoftwareButton() {
		return driver.findElement(acceptcookies);
		
	}
	
	
	By slectlanguage=By.xpath("//*[@id=\"hsg-nav-global\"]/nav/div/div/ul[1]/li[1]/div/button/span");
	
	public  WebElement SelectlanguageIcon() {
		
		return driver.findElement(languagelist);
		
		
	}
	
	
	By languagelist = By.xpath("//ul[@id='Language-submenu']");

	public List<WebElement> LanguageList() {
		return driver.findElements(languagelist);

	}
	
	
	

	public void clickonseleniumutomationTesting() {
		seleniumutomationTesting.click();

	}

	public  WebElement clickOnselenium() {

		return seleniumutomationTesting;

	}

	public static void main(String[] args) {

	}

}
