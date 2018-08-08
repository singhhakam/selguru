package browserlaunch;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Gecko{

public static void main(String[] args) throws InterruptedException {
		
	DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	capabilities.setCapability("marionette", true);
	
	System.setProperty("webdriver.gecko.driver", "D:\\Automation Tools\\workspace\\selguru\\driver\\geckodriver.exe");

	WebDriver driver = new FirefoxDriver();

//	driver.get("http://www.toolsqa.com");
	
	driver.navigate().to("http://www.toolsqa.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getClass());
	
//  driver.navigate().back();
    
    
	Thread.sleep(5000);
	driver.quit();
}
}