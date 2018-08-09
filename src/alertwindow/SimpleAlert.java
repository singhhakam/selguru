package alertwindow;





	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class SimpleAlert {

		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Automation Tools\\workspace\\selguru\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		// This step will result in an alert on screen
		driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
 
		Alert simpleAlert = driver.switchTo().alert();
		
		String alertText = simpleAlert.getText();
		
		System.out.println("Alert text is " + alertText);	
		Thread.sleep(100);
		simpleAlert.accept();
	}
	    


	}



