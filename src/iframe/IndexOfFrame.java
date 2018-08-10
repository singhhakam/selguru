package iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IndexOfFrame {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "D:\\Automation Tools\\workspace\\selguru\\driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();

	    driver.get("http://demo.guru99.com/test/guru99home/");  
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    int size = driver.findElements(By.tagName("iframe")).size();

	   
	    driver.switchTo().frame(0); //Switching to the frame
	    
		System.out.println("********We are switched to the iframe*******");
		driver.findElement(By.xpath("html/body/a/img")).click();
		
		//Clicking the element in line with Advertisement
	    System.out.println("*********We are done***************");
	    
	    driver.quit();
	    }
	
	}

