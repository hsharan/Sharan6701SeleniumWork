package SeleniumSessions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGExecutionSequence {
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Begin = beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("close = afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Begin = beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("close = afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Begin = beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("close = afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Begin = beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("close = afterSuite");
  }
  
  
  @Test
  public void test1() {
	  System.out.println("Test1");
  }
  
  @Test
  public void test2() {
	  System.out.println("Test2");
  }
  

}
