package SeleniumSessions;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LoginQS {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		

WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
//driver.get("http://sharantest6701/dist/#/login");
driver.get("https://quickship-p21test.azurewebsites.net/dist/#/login");
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
Thread.sleep(1000);

By regCode = By.xpath("//label[text()='Registration Code']/..//input");
By un = By.xpath("//label[text()='User Name']/..//input");
By pwd = By.xpath("//label[text()='Password']/..//input");
By loginBtn = By.xpath("//button[@type='submit']//div");
By home = By.xpath("//li[@id='Home']");

By bol = By.xpath("//h4[text()='Bill of Lading']");
By cc = By.xpath("//h4[text()='Close Carriers']");
By fcs = By.xpath("//h4[text()='FedEx Consolidated Shipment']");
By ip = By.xpath("//h4[text()='International Paperwork']");
By mi = By.xpath("//h4[text()='Manifest Inquiry']");
By rs = By.xpath("//h4[text()='Rate Shopping']");
By setup = By.xpath("//h4[text()='Setup']");
By ship = By.xpath("//h4[text()='Shipments']");
By ssi = By.xpath("//h4[text()='Shipments Summary Inquiry']");

doSendKeys(regCode, "Quickshipdemo");
doSendKeys(un, "admin");
doSendKeys(pwd, "password123");
doClick(loginBtn);

//===========================  Quickship Home screen
System.out.println(driver.getTitle());
Thread.sleep(100);
By h1_header_hm = By.xpath("//h1[text()='Quick Ship']");
String hm1= "Bill of Lading";


System.out.print(driver.findElement(h1_header_hm).getText());
String stra = driver.findElement(h1_header_hm).getText();

if(hm1.equals(stra)) {
	System.out.print(": Heading matches : PASS "+" >> " + "URL is : "+ driver.getCurrentUrl() +"\n");
	}else {
		System.out.println(" Heading mis-matches : FAIL");
	}
		



Thread.sleep(5000);
//===========================  Bill of Lading screen
doClick(bol);
By h1_header_BOL = By.xpath("//h1[text()='Bill of Lading']");
String bol1= "Bill of Lading";


System.out.print(driver.findElement(h1_header_BOL).getText());
String str1 = driver.findElement(h1_header_BOL).getText();

if(bol1.equals(str1)) {
	System.out.print(": Heading matches : PASS "+" >> " + "URL is : "+ driver.getCurrentUrl() +"\n");
	}else {
		System.out.println(" Heading mis-matches : FAIL");
	}
		
	
doClick(home);
//===========================  close Carrier screen
doClick(cc);

By h2_header_cc = By.xpath("//h2[text()='Close Carriers']");
String cc1= "Close Carriers";


System.out.print(driver.findElement(h2_header_cc).getText());
String str2 = driver.findElement(h2_header_cc).getText();

if(cc1.equals(str2)) {
	System.out.print(": Heading matches : PASS "+" >> " + "URL is : "+ driver.getCurrentUrl() +"\n");
	}else {
		System.out.println(" Heading mis-matches : FAIL");
	}
		
	
doClick(home);

//*************** FedEx Consolidation shipment screen
doClick(fcs);

By h2_header_fcp = By.xpath("//h1[text()='FedEx Consolidated Shipment']");
String fcp1= "FedEx Consolidated Shipment";


System.out.print(driver.findElement(h2_header_fcp).getText());
String str3 = driver.findElement(h2_header_fcp).getText();

if(fcp1.equals(str3)) {
	System.out.print(": Heading matches : PASS "+" >> " + "URL is : "+ driver.getCurrentUrl() +"\n");
	}else {
		System.out.println(" Heading mis-matches : FAIL");
	}


	
doClick(home);

//*************** International Paperwork screen
doClick(ip);

By h2_header_ip = By.xpath("//h1[text()='International Paperwork']");
String ip1= "International Paperwork";


System.out.print(driver.findElement(h2_header_ip).getText());
String str4 = driver.findElement(h2_header_ip).getText();

if(ip1.equals(str4)) {
	System.out.print(": Heading matches : PASS "+" >> " + "URL is : "+ driver.getCurrentUrl() +"\n");
}else {
	System.out.println(" Heading mis-matches : FAIL");
}
	
doClick(home);



//*************** Manifest Inquiry" screen
doClick(mi);

By h2_header_mi = By.xpath("//h2[text()='Manifest Inquiry']");
String mi1= "Manifest Inquiry";


System.out.print(driver.findElement(h2_header_mi).getText());
String str5 = driver.findElement(h2_header_mi).getText();

if(mi1.equals(str5)) {
	System.out.print(": Heading matches : PASS "+" >> " + "URL is : "+ driver.getCurrentUrl() +"\n");
}else {
	System.out.println(" Heading mis-matches : FAIL");
}
	
doClick(home);


//*************** Rate Shopping screen
doClick(rs);

By h2_header_rs = By.xpath("//h1[text()='Rate Shopping']");
String rs1= "Rate Shopping";


System.out.print(driver.findElement(h2_header_rs).getText());
String str6 = driver.findElement(h2_header_rs).getText();

if(rs1.equals(str6)) {
	System.out.print(": Heading matches : PASS "+" >> " + "URL is : "+ driver.getCurrentUrl() +"\n");
}else {
	System.out.println(" : Heading mis-matches : FAIL");
}
	
doClick(home);

//*************** Setup screen
doClick(setup);

By h2_header_se = By.xpath("//h1[text()='Setup']");
String se1= "Setup";


System.out.print(driver.findElement(h2_header_se).getText());
String str7 = driver.findElement(h2_header_se).getText();

if(se1.equals(str7)) {
	System.out.print(": Heading matches : PASS "+" >> " + "URL is : "+ driver.getCurrentUrl() +"\n");
}else {
	System.out.println(" : Heading mis-matches : FAIL");
}
	
doClick(home);

//*************** Shipments screen
doClick(ship);

By h2_header_sh = By.xpath("//h1[text()='Shipments']");
String sh1= "Shipments";


System.out.print(driver.findElement(h2_header_sh).getText());
String str8 = driver.findElement(h2_header_sh).getText();

if(sh1.equals(str8)) {
	System.out.print(": Heading matches : PASS "+" >> " + "URL is : "+ driver.getCurrentUrl() +"\n");
}else {
	System.out.println(" : Heading mis-matches : FAIL");
}
	
doClick(home);

//*************** Shipments Summary Inquiry screen
doClick(ssi);

By h2_header_ssi = By.xpath("//h2[text()='Shipments Summary Inquiry']");
String ssi1= "Shipments Summary Inquiry";


System.out.print(driver.findElement(h2_header_ssi).getText());
String str9 = driver.findElement(h2_header_ssi).getText();

if(ssi1.equals(str9)) {
	System.out.print(": Heading matches : PASS "+" >> " + "URL is : "+ driver.getCurrentUrl() +"\n");
}else {
	System.out.println(" : Heading mis-matches : FAIL");
}
	
doClick(home);

//******************************************* SHIPMENT 
doClick(ship);
By miscSh = By.xpath("//div[contains(text(), 'Misc. Shipment')]");
 doClick(miscSh);
 Thread.sleep(2000);
 
By custAddress2 = By.xpath("(//span[@class='ep-item-label'])[2]");


WebElement element = driver.findElement(custAddress2);
Actions actions = new Actions(driver);
actions.moveToElement(element).click().build().perform();



By custEdit = By.xpath("(//span)[8]");
doClick(custEdit);
Thread.sleep(2000);

By custCompany= By.xpath("//label[text()='Company *']/..//input");
doSendKeys(custCompany, "sharan Test Ltd");

By custAddLine1= By.xpath("//label[text()='Address Line 1']/..//input");
doSendKeys(custAddLine1, "6701 Sharan Test Ltd");

By custCity= By.xpath("//label[text()='City *']/..//input");
doSendKeys(custCity, "Minneapolis");

By custCountry= By.xpath("//label[text()='Country *']/..//input");
driver.findElement(custCountry).clear();
doSendKeys(custCountry, "United States");


By custDistrict= By.xpath("//label[text()='District']/..//input");
doSendKeys(custDistrict, "Minnesota");


By custPostCode= By.xpath("//label[text()='Postal Code *']/..//input");
doSendKeys(custPostCode, "55426");


By custSave= By.xpath("//button[@type='button']//div[text()=' Save']");
doClick(custSave);

System.out.println("Successfully saved the data");

Thread.sleep(5000);

By custNext = By.xpath("//button[@type='button']//div[text()=' Next']");
doClick(custNext);


By miscProdAdd = By.xpath("//button[@type='button']//div[text()=' Add ']");
doClick(miscProdAdd);
Thread.sleep(10000);

By miscProdSearch = By.xpath("(//input[@type='text'])[2]");
doSendKeys(miscProdSearch, "HAHA");


By miscProdSearchBtn = By.xpath("//button[@type='button']//div[text()='Search']");
doClick(miscProdSearchBtn);

Thread.sleep(3000);

By miscProdSelect = By.xpath("//div[text()='HAHA']//ancestor::td/..//label");



WebElement element1 = driver.findElement(miscProdSelect);
Actions actions1 = new Actions(driver);
Thread.sleep(3000);
actions1.moveToElement(element1).click().build().perform();




//doClick(miscProdSelect);

Thread.sleep(3000);
By addProdQty = By.xpath("//table[@role='presentation']//td[4]//div//input");
By add_pro = By.xpath("//table[@role='presentation']//td[4]//div");
doClick(add_pro);
doSendKeys(addProdQty, "1"+Keys.TAB);


By addProdUnitPrice = By.xpath("//table[@role='presentation']//td[5]//div//input");
doSendKeys(addProdUnitPrice, "1"+Keys.TAB);

By addProdExpUnitPrice = By.xpath("//table[@role='presentation']//td[6]//div//input");
doSendKeys(addProdExpUnitPrice, "1");

By shipCreateSave = By.xpath("//button[@type='button']//div[text()=' Save']");
doClick(shipCreateSave);
Thread.sleep(10000);

System.out.println("Shipment created successfully");

By shipShipCode = By.xpath("//*[@id='shipCode']//input");
driver.findElement(shipShipCode).clear();
doSendKeys(shipShipCode, "EPMI"+Keys.ENTER);

System.out.println("Shipment created successfully");

By shipToCust = By.xpath("//*[@id='customer']//input");
driver.findElement(shipToCust).clear();
doSendKeys(shipToCust, "SSH-CAD-001"+Keys.ENTER);

Thread.sleep(15000);


By doShip = By.xpath("//button[@type='button']//div[text()='Ship']");
doClick(doShip);

Thread.sleep(15000);

By shipPackId = By.xpath("packid");
String shipPackId1 = driver.findElement(shipPackId).getText();
System.out.println("shipment number is :"+shipPackId1);

By shipNum = By.xpath("//*[@id='shipmentId']//input");
String shipNum1 = driver.findElement(shipNum).getText();

By shipStatus = By.xpath("//*[@id='status']//input");
String shipStatus1 = driver.findElement(shipStatus).getText();
System.out.println("Shipment status : "+shipStatus1 +"<<"+"shipment number is :"+shipNum1);



//driver.quit();		
			


	}
	
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value){
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator){
		getElement(locator).click();
	}
	
	public static void tdoClick(By locator){
		getElement(locator).click();
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
