/**
 * 
 */
package testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import base.Setup;
import pages.ATA;

/**
 * @author nitinthite
 *
 */
public class Question3 extends Setup{
	
	@BeforeGroups("solution3")
	public void beforeGroup3() throws InterruptedException {
		System.out.println("In before test 3");
		webSetup("http://ata123456789123456789.appspot.com/");
	}

	@Test(priority = 3, groups = "solution3")
	public void calculator() throws InterruptedException {
		System.out.println("In test 3");

		ATA ata = new ATA();
		ata.selectEuclidRadioButton();
		ata.enterNumbersAndPrintResult();
	}
	
	@AfterSuite
	public void quiteDriverSession() {
		System.out.println("In After group 3");
		driver.quit();
	}

}
