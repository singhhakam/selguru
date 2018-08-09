package alertwindow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	System.setProperty("webdriver.gecko.driver", "D:\\Automation Tools\\workspace\\selguru\\driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
    // Launch the URL

    driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

    // Click on the Button "Alert Box"

    driver.findElement(By.xpath(".//*[@id='alert']")).click();

    // Switch to JavaScript Alert window

    Alert myAlert = driver.switchTo().alert();

    // Accept the Alert

    myAlert.accept();

    // Close Original window

    driver.close();
	}

}
