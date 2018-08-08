package browserlaunch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver","D:\\Automation Tools\\workspace\\selguru\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.toolsqa.com");
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		
		
		
		
		
		
		
	}

}
