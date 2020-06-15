package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import base.Setup;
import pages.Gmaps;

public class Question1 extends Setup{
 
	@BeforeGroups("solution1")
  public void beforeGroup() {
		System.out.println("In before test");
		webSetup("https://www.google.com/maps/");
  }
	
	@Test (priority = 1, groups="solution1")
	public void searchIntendedPlaceAndVerify() {
		System.out.println("In test");
		
		Gmaps gmap = new Gmaps();
		
		gmap.searchPlace();
		gmap.verifyText();
		gmap.verityTitle();
		gmap.ratingsAndReviews();
		
	}
	
	@AfterMethod
	@AfterGroups("solution1")
	  public void tearDown() {
			System.out.println("In After group");
			driver.close();
	}
}