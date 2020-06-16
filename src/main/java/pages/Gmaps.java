/**
 * 
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.testng.*;

import base.Setup;

/**
 * @author nitinthite
 *
 */
public class Gmaps extends Setup {

	public void searchPlace() {

		searchBar().sendKeys("Wankhede Stadium");
		searchBar().sendKeys(Keys.ENTER);
	}

	public void verityTitle() {

		String title = driver.getTitle();

		if (title.equalsIgnoreCase("Wankhede Stadium - Google Maps")) {
			System.out.println("Title verified");
		} else {
			System.out.println("Could not verify the title!");
		}
	}

	public void verifyText() {
		
		driver.switchTo().frame(resultFrame());

		String res = pageResult().getText();

		if (res.contains("Stadium")) {
			System.out.println("Test Stadium present in the title");
		} else {
			System.out.println("Test Stadium DOES NOT present in the title");
		}
	}

	public void ratingsAndReviews() {

		String ratings = ratings().getText();
		System.out.print("Ratings points displayed: " + ratings);

		String reviews = reviewsNumber().getText();
		System.out.print("Total number of reviews displayed: " + reviews);

	}

	// Elements from the page used in the methods above.

	private WebElement searchBar() {
		return driver.findElement(By.xpath("//input[@id='searchboxinput']"));
	}

	private WebElement pageResult() {
		return driver.findElement(By.xpath("//*[@class='section-hero-header-title-description']"));
	}

	private WebElement resultFrame() {
		return driver.findElement(By.id("FirebugUI"));
	}

	private WebElement ratings() {
		return driver.findElement(By.xpath("//*[@class='section-rating-container']"));
	}

	private WebElement reviewsNumber() {
		return driver.findElement(By.xpath("//*[@class='section-rating-container']"));
	}

}
