/**
 * 
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Setup;

/**
 * @author nitinthite
 *
 */
public class QAagility extends Setup {
	
	public void verityTitle() {

		String title = driver.getTitle();

		if (title.equalsIgnoreCase("QAAgility")) {
			System.out.println("Title verified");
		} else {
			System.out.println("Could not verify the title!");
		}
	}
	
	public void displayLogoSize() {
		
		int size = Integer.parseInt(logoSize().getAttribute("size"));
		System.out.println("Logo size is :"+size);
	}
	
	// Elements from the page used in the methods above.

		private WebElement logoSize() {
			return driver.findElement(By.xpath("//a[@href='./index.html']"));
		}

}
