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
public class ATA extends Setup {

	public void selectEuclidRadioButton() throws InterruptedException {

		euclidMinus().click();
	}

	public void enterNumbersAndPrintResult() throws InterruptedException {

		firstNumber().sendKeys("7");
		secondNumber().sendKeys("4");
		calculateButton().click();
		System.out.println("Result is:" + resultContainer().getText());

	}

	// Elements from the page used in the methods above.

	private WebElement euclidMinus() {
		return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("gwt-uid-7"))));
	}

	private WebElement firstNumber() {
		return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("ID_nameField1"))));
	}

	private WebElement secondNumber() {
		return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("ID_nameField2"))));
	}

	private WebElement calculateButton() {
		return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("ID_calculator"))));
	}

	private WebElement resultContainer() {
		return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("ID_nameField3"))));
	}
}
