/**
 * 
 */
package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import base.Setup;
import pages.QAagility;

/**
 * @author nitinthite
 *
 */
public class Question2 extends Setup {

	@BeforeGroups("solution2")
	public void beforeGroup2() {
		System.out.println("In before test");
		webSetup("https://www.qaagility.com");
	}

	@Test(priority = 2, groups = "solution2")
	public void verifyTitleAndPrintLogoSize() {
		System.out.println("In test");

		QAagility qaa = new QAagility();

		qaa.verityTitle();
		qaa.displayLogoSize();

	}

	@AfterGroups("solution2")
	public void tearDown2() {
		System.out.println("In After group");
		driver.close();
	}

}
