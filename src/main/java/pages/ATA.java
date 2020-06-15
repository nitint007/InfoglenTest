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
public class ATA extends Setup {
	
	public void selectEuclidRadioButton() {
		
		euclidMinus().click();
	}
	
	public void enterNumbersAndPrintResult() {
		
		firstNumber().sendKeys("7");
		secondNumber().sendKeys("4");
		calculateButton().click();
		System.out.println("Result is:"+resultContainer().getText());
		
	}

	// Elements from the page used in the methods above.

	private WebElement euclidMinus() {
		return driver.findElement(By.id("gwt-uid-7"));
	}
	
	private WebElement firstNumber() {
		return driver.findElement(By.id("nameFieldContainer1"));
	}

	private WebElement secondNumber() {
		return driver.findElement(By.id("nameFieldContainer2"));
	}
	
	private WebElement calculateButton() {
		return driver.findElement(By.id("ID_calculator"));
	}
	
	private WebElement resultContainer() {
		return driver.findElement(By.id("nameFieldContainer3"));
	}
}
