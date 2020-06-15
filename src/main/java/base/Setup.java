/**
 * 
 */
package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author nitinthite
 *
 */
public class Setup {
	
	public static WebDriver driver;
	
	public Setup() {
		
	}
	
	public WebDriver webSetup(String URL) {
		
		if (driver == null) {
			
			if (URL.contains("https://www.google.com/maps/")) {
				// please uncomment the line below if you are running the suite on Windows OS
//				System.setProperty("Webdriver.driver.chromeDriver", "./src/test/resources/drivers/chromedriver.exe");
				
				driver = new ChromeDriver();
			}
			else {
				
				driver = new FirefoxDriver();
			}
			
			
			driver.get(URL);
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			driver.manage().deleteAllCookies();
		}
		return driver;
		
	}

}
