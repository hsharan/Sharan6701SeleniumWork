package SeleniumSessions;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomerAdd {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://sharantest6701/dist/#/login");
		// driver.get("https://quickship-p21test.azurewebsites.net/dist/#/login");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		Thread.sleep(1000);
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		// System.out.println(ts);

		By regCode = By.xpath("//label[text()='Registration Code']/..//input");
		By un = By.xpath("//label[text()='User Name']/..//input");
		By pwd = By.xpath("//label[text()='Password']/..//input");
		By loginBtn = By.xpath("//button[@type='submit']//div");
		By home = By.xpath("//li[@id='Home']");

		By setup = By.xpath("//h4[text()='Setup']");
		By customerPage = By.xpath("//h4[text()='Customers']");
		By custAddBtn = By.xpath("//*[@type=\"button\"]/div[text()=' Add ']");
		
		//Customer add xpaths
		By custHeader = By.xpath("//h5[text()='Add Customer']");
		By custKey = By.xpath("//label[text()='Key*']/..//input");
		By custCompany = By.xpath("//label[text()='Company*']/..//input");
		By custContactName = By.xpath("//label[text()='Contact Name']/..//input");
		By custPhoneNum = By.xpath("//label[text()='Phone Number']/..//input");
		By custAddress1 = By.xpath("//label[text()='Address Line 1']/..//input");
		By custCity = By.xpath("//label[text()='City']/..//input");
		By custPostCode = By.xpath("//label[text()='Postal Code']/..//input");
		By custAddressType = By.xpath("(//span//input[@role='combobox' and @aria-haspopup='listbox'])[position()=2]");
		By custCountryType = By.xpath("(//span//input[@role='combobox' and @aria-haspopup='listbox'])[position()=3]");
		By custDistrictType = By.xpath("(//span//input[@role='combobox' and @aria-haspopup='listbox'])[position()=4]");
		By custSaveBtn = By.xpath("//*[@type=\"button\"]/div[text()='Save ']");
	//WebElement custAddressType	= driver.findElement(By.xpath("(//span//input[@role='combobox' and @aria-haspopup='listbox'])[position()=2]"));
				
		
		
		doSendKeys(regCode, "QuickshipDemo");
		doSendKeys(un, "admin");
		doSendKeys(pwd, "password123");
		doClick(loginBtn);

		//==========================================================
		doClick(setup);
		By h2_header_se = By.xpath("//h1[text()='Setup']");
		String se1 = "Setup";
		System.out.print(driver.findElement(h2_header_se).getText());
		String str7 = driver.findElement(h2_header_se).getText();

		if (se1.equals(str7)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" : Heading mis-matches : FAIL");
		}
		doClick(customerPage);
		doClick(custAddBtn);
		doSendKeys(custKey, "102");
		doSendKeys(custCompany, "Shh_LTD2");
		doSendKeys(custContactName, "Test2");
		doSendKeys(custPhoneNum, "7338222205");
		doSendKeys(custAddress1, "6701 test sharan");
		doSendKeys(custCity, "Belleville");
		doSendKeys(custPostCode, "K8N 5W6");
		
		doClick(custAddressType);
		doSendKeys(custAddressType, "Customer");
		clickSendKeyTab(custAddressType);
		
		doSendKeys(custCountryType, "Canada");
		clickSendKeyTab(custCountryType);
		
	
		doSendKeys(custDistrictType, "Ontario");
		clickSendKeyTab(custDistrictType);
		
		doClick(custSaveBtn);
	
		
		
		
		
		
		
		/*
		 * //WebElement text = driver.findElement(By.xpath(
		 * ("//span//input[@role='combobox' and @aria-haspopup='listbox'])[position()=2]"
		 * ))); List<WebElement> allOptions = driver.findElements(By.
		 * xpath("((//input[@role='combobox' and @aria-haspopup='listbox'])[position()=2]//following::span"
		 * )); System.out.println("total values" +allOptions.size());
		 * 
		 * for(int i = 0; i<=allOptions.size()-1; i++) { String tex =
		 * allOptions.get(i).getText(); System.out.println(tex); }
		 * 
		 * //text.sendKeys(Keys.ARROW_DOWN); //text.sendKeys(Keys.TAB);
		 * 
		 */
		
		
		
		

	}
	
	
	private static void clickSendKeyTab(By locator) {
		// TODO Auto-generated method stub
		driver.findElement(locator).sendKeys(Keys.TAB);
		
	}




	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static void tdoClick(By locator) {
		getElement(locator).click();
	}

	private static void methodToTime() {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void selectDropDownValueWithoutSelectClass(By locator, String value) {
		List<WebElement> industry_options_list = driver.findElements(locator);
		for (WebElement ele : industry_options_list) {
			String text = ele.getText();
			if (text.equals(value)) {
				ele.click();
				break;
			}
		}
	}

}
