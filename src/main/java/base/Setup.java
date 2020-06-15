/**
 * 
 */
package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
			
			// please uncomment the line below if you are running the suite on Windows OS
//			System.setProperty("Webdriver.driver.chromeDriver", "./src/test/resources/drivers/chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().window().fullscreen();
			
			driver.get(URL);
			
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			driver.manage().deleteAllCookies();
		}
		return driver;
		
	}

}
