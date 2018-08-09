package alertwindow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class SwitchWindowTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	System.setProperty("webdriver.gecko.driver", "D:\\Automation Tools\\workspace\\selguru\\driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();

	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
     // Launch the URL

     driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

     // Store and Print the name of the First window on the console

     String handle= driver.getWindowHandle();

     System.out.println(handle);

     // Click on the Button "New Message Window"

     driver.findElement(By.xpath(".//*[@id='button1']")).click();

     // Store and Print the name of all the windows open	              

     java.util.Set<String> handles =  driver.getWindowHandles();

     System.out.println(handles);

     // Pass a window handle to the other window

     for (String handle1 : driver.getWindowHandles()) {

     	System.out.println(handle1);

     	driver.switchTo().window(handle1);

     	}

     // Closing Pop Up window

     driver.close();

     // Close Original window

     driver.quit();

	
	}
}
