/**
 * 
 */
package testcases;

import org.testng.annotations.AfterGroups;
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
	public void beforeGroup3() {
		System.out.println("In before test3");
		webSetup("http://ata123456789123456789.appspot.com/");
	}

	@Test(priority = 3, groups = "solution3")
	public void calculator() {
		System.out.println("In test3");

		ATA ata = new ATA();
		ata.selectEuclidRadioButton();
		ata.enterNumbersAndPrintResult();
	}

	@AfterGroups("solution3")
	public void tearDown2() {
		System.out.println("In After group3");
		driver.close();
	}
	
	@AfterSuite
	public void quiteDriverSession() {
		System.out.println("In After group3");
		driver.quit();
	}

}
