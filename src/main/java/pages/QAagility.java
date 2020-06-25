/**
 * 
 */
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Setup;

/**
 * @author nitinthite
 *
 */
public class QAagility extends Setup {
	
	@FindBy(xpath = "//nav[3]//div[1]/div[1]/a/img")
	WebElement logoSize;
	
	public QAagility() {
		
		PageFactory.initElements(driver, this);
	}

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

		int height = wait.until(ExpectedConditions.elementToBeClickable(logoSize)).getSize().getHeight();
		int width = wait.until(ExpectedConditions.elementToBeClickable(logoSize)).getSize().getWidth();
		System.out.println("Logo height is :" +height+ " and width is :"+width);
	}

}
