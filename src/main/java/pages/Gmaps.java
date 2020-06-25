/**
 * 
 */
package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import base.Setup;

/**
 * @author nitinthite
 *
 */
public class Gmaps extends Setup {
	
	@FindBy(xpath = "//input[@id='searchboxinput']")
	WebElement searchBar;
	
	@FindBy(xpath = "//div[@class='section-hero-header-title-description']//span")
	WebElement pageResult;
	
	@FindBy(xpath = "//span[@class='section-star-display']")
	WebElement ratings;
	
	@FindBy(xpath = "//span[@class='section-rating-term-list']")
	WebElement reviewsNumber;
	
	public Gmaps() {
		
		PageFactory.initElements(driver, this);
	}

	public void searchPlace() {

		wait.until(ExpectedConditions.elementToBeClickable(searchBar)).sendKeys("Wankhede Stadium");
		wait.until(ExpectedConditions.elementToBeClickable(searchBar)).sendKeys(Keys.ENTER);
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

		String res = wait.until(ExpectedConditions.elementToBeClickable(pageResult)).getText();

		if (res.contains("Stadium")) {
			System.out.println("Test Stadium present in the title");
		} else {
			System.out.println("Test Stadium DOES NOT present in the title");
		}
	}

	public void ratingsAndReviews() {

		String rating = ratings.getText();
		System.out.print("Ratings points displayed: " + ratings);

		String reviews = reviewsNumber.getText();
		System.out.print("Total number of reviews displayed: " + reviews);

	}

}
