package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {

	public static void main(String args[]) throws InterruptedException{
	System.setProperty("webdriver.gecko.driver", "D:\\Automation Tools\\workspace\\selguru\\driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	
	String appUrl = "http://www.DemoQA.com";
	driver.get(appUrl);
	
	Thread.sleep(200);
	// Click on Registration link
	driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();

	// Go back to Home Page
	driver.navigate().back();
	driver.wait(50);
	// Go forward to Registration page
	driver.navigate().forward();

	// Go back to Home page
	driver.navigate().to(appUrl);

	// Refresh browser
	driver.navigate().refresh();

	// Close browser
	driver.close();
	driver.quit();
	
	}
}
