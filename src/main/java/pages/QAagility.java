/**
 * 
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Setup;

/**
 * @author nitinthite
 *
 */
public class QAagility extends Setup {

	public void verityTitle() {

		String title = driver.getTitle();
		
		System.out.print("Title of the page opened is :"+title);

		if (title.contains("QAAgility")) {
			System.out.println("Title verified");
		} else {
			System.out.println("Could not verify the title!");
		}
	}

	public void displayLogoSize() {

		int height = logoSize().getSize().getHeight();
		int width = logoSize().getSize().getWidth();
		System.out.println("Logo height is :" +height+ " and width is :"+width);
	}

	// Elements from the page used in the methods above.

	private WebElement logoSize() {
		return wait.until(
				ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//nav[3]//div[1]/div[1]/a/img"))));
	}

}
