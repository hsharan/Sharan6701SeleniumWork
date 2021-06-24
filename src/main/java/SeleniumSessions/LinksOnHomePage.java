package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksOnHomePage {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// driver.get("http://sharantest6701/dist/#/login");
		// driver.get("https://quickship-e10demo.azurewebsites.net/dist/#/login");
		//driver.get("https://quickship-p21test.azurewebsites.net/dist/#/login");
		driver.get("http://sharantest6701/dist/#/login");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		Thread.sleep(1000);

		By regCode = By.xpath("//label[text()='Registration Code']/..//input");

		By un = By.xpath("//label[text()='User Name']/..//input");
		By pwd = By.xpath("//label[text()='Password']/..//input");
		By loginBtn = By.xpath("//button[@type='submit']//div");
		// By home = By.xpath("//li[@id='Home']");
		// By header = By.xpath("//h4");

		By setup = By.xpath("//h4[text()='Setup']");

		doSendKeys(regCode, "QuickshipDemo");
		doSendKeys(un, "admin");
		doSendKeys(pwd, "password123");
		doClick(loginBtn);
		System.out.println("=======================================================================================");
		System.out.println("                                     Tested URL  ");
		System.out.println("=======================================================================================");

		System.out.println(driver.getCurrentUrl());
		// allElements(header);
		System.out.println("=======================================================================================");
		System.out.println("                                     HOME screen Links  ");
		System.out.println("=======================================================================================");
		Thread.sleep(1000);
		List<WebElement> test1 = driver.findElements(By.xpath("//h4"));
		System.out.println(test1.size());
		// int count = test1.size();
		for (int i = 0; i < test1.size(); i++) {
			String str1 = test1.get(i).getText();
			System.out.println(i + 1 + "." + str1);
		}

		doClick(setup);
		System.out.println("=======================================================================================");
		System.out.println("                                     SETUP screen Links  ");
		System.out.println("=======================================================================================");
		driver.findElements(By.xpath("//h4"));
		List<WebElement> test2 = driver.findElements(By.xpath("//h4"));
		System.out.println(test2.size());
		for (int j = 0; j < test2.size(); j++) {
			String str2 = test2.get(j).getText();
			System.out.println(j + 1 + "." + str2);
		}

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static WebElement getElements(By locator) {
		return (WebElement) driver.findElements(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void allElements(By locator) {
		getElements(locator);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public void doPrintAllElements(By locator) {
		getElements(locator).getText();
	}

	public static void tdoClick(By locator) {
		getElement(locator).click();
	}

}
