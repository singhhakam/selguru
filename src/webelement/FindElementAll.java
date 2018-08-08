package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementAll {
	
	public static void main(String[] args) {
	
	// TODO Auto-generated method stub
	

		
	System.setProperty("webdriver.gecko.driver", "D:\\Automation Tools\\workspace\\selguru\\driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("http://www.DemoQA.com");
	
	
	WebElement registration = driver.findElement(By.xpath(".//*[@id='menu-item-374']"));
	registration.click();
	System.out.println(registration.getText());
	System.out.println(registration.getRect());
	System.out.println(registration.getSize());
	System.out.println("click done on registration");
	try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	//WebElement fname= driver.findElement(By.xpath(".//*[@id='name_3_firstname']"));
	//driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/input[1]")).click();
	
	//fname.sendKeys("Peter");
	
	
	
	
 driver.quit();
	
	
	}

}
