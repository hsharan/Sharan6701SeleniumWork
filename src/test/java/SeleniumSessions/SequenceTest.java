package SeleniumSessions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SequenceTest {
	
	@BeforeTest
	public void bt() {
		System.out.println("BeforeTest =====> Before Test");
	}
	
	@AfterTest
	public void at() {
		System.out.println("AfterTest =====> After Test");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("BeforeMethod =====> Before Method");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("AfterMethod =====> After Method");
	}
	
	@BeforeSuite
	public void bs() {
		System.out.println("BeforeSuit =====> Before Suit");
	}
	
	@AfterSuite
	public void as() {
		System.out.println("AfterSuit =====> After Suit");
	}
	
	@Test
	public void test1() {
		System.out.println("Test 1");
		
	}
	
	
	
	

}
