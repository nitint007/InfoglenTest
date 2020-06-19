/**
 * 
 */
package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author nitinthite
 *
 */
public class Setup {

	public static WebDriver driver;
	public static WebDriverWait wait;

	public Setup() {

		// To initialise properties objects in case required.
	}

	public WebDriver webSetup(String URL) {

		if (URL.contains("https://www.google.com/maps/")) {
			// please uncomment the line below if you are running the suite on Windows OS
			// System.setProperty("Webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");

			driver = new ChromeDriver();
		} else {

			driver = new FirefoxDriver();
		}

		driver.get(URL);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		wait = new WebDriverWait(driver, 30);

		return driver;
	}

}
