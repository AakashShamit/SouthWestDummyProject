package testClasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class NewTest extends BaseTestClass {
	private static final Logger log = LogManager.getLogger(NewTest.class.getName());
	
	@Test
	public void testLoginFail() throws Exception {
		soft.assertTrue(v.vIsVisible(homePage.getLoginLink()), "Login Link is not visible on the webpage Loaded");
		//soft.assertEquals("Log In", "", "");
		log.info("message random h");
		homePage.clickVacationTab();
		System.out.println("hello testing started");
		
	}

	

}
