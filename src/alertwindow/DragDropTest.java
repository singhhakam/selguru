package alertwindow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragDropTest {


	public static void main(String[] args) {
	// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Automation Tools\\workspace\\selguru\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// It is always advisable to Maximize the window before performing DragNDrop action
		 
		 driver = new FirefoxDriver();
		 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        driver.get("http://www.onlinestore.toolsqa.wpengine.com");
	 
	        WebElement element = driver.findElement(By.linkText("Product Category"));
	 
	        Actions action = new Actions(driver);
	 
	        action.moveToElement(element).build().perform();
	 
	        driver.findElement(By.linkText("iPads")).click();
	}

}
