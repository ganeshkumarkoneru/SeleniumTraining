package TestNgPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YahooMailTest {

	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch FF");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Login to app");
	}
	
	@Test(priority=1)
	public void composeMailTest() {
		System.out.println("compose mail test");
	}
	
	@Test(priority=2)
	public void DeleteMail() {
		System.out.println("compose mail test");
	}
		
		

	@AfterMethod
	public void logout() {
		System.out.println("Logout");
	}
	
	@AfterClass
	public void quitBrowser() {
		System.out.println("Quit");
	}
}
