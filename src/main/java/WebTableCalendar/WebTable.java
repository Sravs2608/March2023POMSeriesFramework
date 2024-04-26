package WebTableCalendar;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");

		Thread.sleep(5000);
		
		  //multi selection
		  
		  while(true)
		  if(driver.findElements(By.xpath("//td[text()='India']")).size()>0) {
			  selectMultipleCountry("India");
			
		  
		  } 
		  else 
		  { //pagination logic
			  WebElement next = driver.findElement(By.linkText("Next"));
		  if(next.getAttribute("class").contains("disabled")) 
		  {
		  System.out.println("pagiation is over...country is not found"); 
		  break;
		  }
		  next.click(); 
		  Thread.sleep(1000);
		  
		  }
		 

		// single selection
		while (true) {
			if (driver.findElements(By.xpath("//td[text()='India']")).size() > 0) {
				selectCountry("India");

				break;
			} else {
				WebElement next = driver.findElement(By.linkText("Next"));
				if (next.getAttribute("class").contains("disabled")) {
					System.out.println("pagiation is over...country is not found");
					break;
				}
				next.click();
				Thread.sleep(1000);

			}

		}

	}

	public static void selectMultipleCountry(String countryName) {

		List<WebElement> eles = driver.findElements(By.xpath("//td[text()='" + countryName + "']/preceding-sibling::td/input[@type='checkbox']"));
		// TODO Auto-generated method stub
		  for(WebElement e: eles)
		  {
			  e.click();
		  }

	}

	public static void selectCountry(String countryName) {

		driver.findElement(By.xpath("//td[text()='" + countryName + "']/preceding-sibling::td/input[@type='checkbox']"))
				.click();
		// TODO Auto-generated method stub

	}

}
