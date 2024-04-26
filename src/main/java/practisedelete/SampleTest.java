package practisedelete;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
	
	    static WebDriver driver;
	
	 //By emailId = By.id("//*[@id=\"input-email\"]");
	 //By password = By.id("input-password");
	// By loginBtn = By.xpath("//input[@value='Login']");
	 
	 //By forgotPwdLink = By.linkText("Forgotten Password");

	   public static void main()
	   {
	
	 driver = new ChromeDriver();
	 
	 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	 
	 
		/*
		 * public SampleTest(WebDriver driver) {
		 * 
		 * this.driver = driver; }
		 * 
		 * public String getLoginPageTitle() {
		 * 
		 * String title = driver.getTitle(); System.out.println("Login Page Title is "+
		 * title); return title; }
		 * 
		 * public String getLoginPageUrl() {
		 * 
		 * String url = driver.getCurrentUrl(); System.out.println("Login url  "+ url);
		 * return url; } public boolean forgotPwdLinkExist() {
		 * 
		 * return driver.findElement(forgotPwdLink).isDisplayed(); }
		 * 
		 * public void doLogin() {
		 * 
		 * 
		 * }
		 */
	 
	
}
}
		

	

