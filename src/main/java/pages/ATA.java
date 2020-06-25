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
public class ATA extends Setup {

	@FindBy(id = "gwt-uid-7")
	WebElement euclidMinus;

	@FindBy(id = "ID_nameField1")
	WebElement firstNumber;

	@FindBy(id = "ID_nameField2")
	WebElement secondNumber;

	@FindBy(id = "ID_calculator")
	WebElement calculateButton;

	@FindBy(id = "ID_nameField3")
	WebElement resultContainer;

	public ATA() {

		PageFactory.initElements(driver, this);
	}

	public void selectEuclidRadioButton() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(euclidMinus)).click();
	}

	public void enterNumbersAndPrintResult() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(firstNumber)).sendKeys("7");
		wait.until(ExpectedConditions.elementToBeClickable(secondNumber)).sendKeys("4");
		wait.until(ExpectedConditions.elementToBeClickable(calculateButton)).click();
		System.out
				.println("Result is:" + wait.until(ExpectedConditions.elementToBeClickable(resultContainer)).getText());

	}
}
