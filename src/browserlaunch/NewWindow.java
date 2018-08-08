package browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewWindow {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.gecko.driver", "D:\\Automation Tools\\workspace\\selguru\\driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();

	driver.get("http://demoqa.com/frames-and-windows/");
	
	
	driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
	
	
	driver.quit();
}
}