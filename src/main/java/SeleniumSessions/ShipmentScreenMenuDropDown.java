package SeleniumSessions;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShipmentScreenMenuDropDown {

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
        Timestamp ts=new Timestamp(date.getTime());  
        //System.out.println(ts);

		By regCode = By.xpath("//label[text()='Registration Code']/..//input");
		By un = By.xpath("//label[text()='User Name']/..//input");
		By pwd = By.xpath("//label[text()='Password']/..//input");
		By loginBtn = By.xpath("//button[@type='submit']//div");
		By home = By.xpath("//li[@id='Home']");
		By shipment = By.xpath("//h4[text()='Shipments']");
		By packId = By.xpath("//input[@type='text']");
		By menuDD = By.xpath("//ep-dropdown-button[@id='menu']//div[text()=' Menu ']");
		

		
		//ep-dropdown-button[@id='menu']//div[text()=' Menu ']
		doSendKeys(regCode, "SharanDemo");
		doSendKeys(un, "admin");
		doSendKeys(pwd, "password123");
		doClick(loginBtn);

		// =========================== Quickship Home screen
		System.out.println(driver.getTitle());
		Thread.sleep(100);
		By h1_header_hm = By.xpath("//h1[text()='Quick Ship']");
		String hm1 = "Quick Ship";

		System.out.print(driver.findElement(h1_header_hm).getText());
		String stra = driver.findElement(h1_header_hm).getText();

		if (hm1.equals(stra)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		Thread.sleep(5000);
		
		doClick(shipment);
		doSendKeys(packId, "35");
		

		
		

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