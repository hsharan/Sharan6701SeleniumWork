package SeleniumSessions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
	
	//@BeforeTest
	@BeforeMethod
	public void bt() {
		System.out.println("BT = Begin Test");
	}
	
	
	@Test
	public void c1()
	{
		System.out.println("C1 - 1");
	}
	@Test
	public void c2()
	{
		System.out.println("C2 - 2");
	}
	@Test
	public void c3()
	{
		System.out.println("C3 - 3");
	}
	
	//@AfterTest
	@AfterMethod
	public void at()
	{
		System.out.println("At = closing test");
	}
	

}
