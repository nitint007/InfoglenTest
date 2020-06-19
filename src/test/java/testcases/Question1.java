package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import base.Setup;
import pages.Gmaps;

public class Question1 extends Setup{
 
	@BeforeGroups("solution1")
  public void beforeGroup() {
		System.out.println("In before test 1");
		webSetup("https://www.google.com/maps/");
  }
	
	@Test (priority = 1, groups="solution1")
	public void searchIntendedPlaceAndVerify() {
		System.out.println("In test 1");
		
		Gmaps gmap = new Gmaps();
		
		gmap.searchPlace();
		gmap.verifyText();
		gmap.verityTitle();
		gmap.ratingsAndReviews();
		
	}
	
	@AfterGroups("solution1")
	  public void tearDown() {
			System.out.println("In After group 1");
			driver.close();
	}
}