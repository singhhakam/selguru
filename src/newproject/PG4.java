package newproject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class PG4 {
	  public static void main(String[] args) {
		  	//System.setProperty("webdriver.firefox.driver","D:\\Automation Tools\\Selenium_data\\driver\\chromedriver.exe");  
		  	//WebDriver driver = new ChromeDriver();
		  	//DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome ();       
		  	//handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
		  	System.setProperty("webdriver.gecko.driver", "D:\\Automation Tools\\Selenium_data\\driver\\geckodriver.exe");
		  	WebDriver driver = new FirefoxDriver();
		  	
		  	driver.manage().window().maximize();
	        driver.get("http://demo.guru99.com/selenium/deprecated.html");
	        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        driver.switchTo().frame("classFrame");

	        
	        
	        System.out.println("frame switched");
	        driver.findElement(By.linkText("Deprecated")).click();
	        driver.close(); 
	    }
}