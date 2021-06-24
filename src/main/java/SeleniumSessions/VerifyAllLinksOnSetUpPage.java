package SeleniumSessions;



import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyAllLinksOnSetUpPage {

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

		By setup = By.xpath("//h4[text()='Setup']");
		By appSet = By.xpath("//h4[text()='App Settings']");
		By bolClass = By.xpath("//h4[text()='BOL Classes']");
		By cXMLfiles = By.xpath("//h4[text()='Carrier Xml Files']");
		By conType = By.xpath("//h4[text()='Container Types']");
		By contry = By.xpath("//h4[text()='Countries']");
		By ccRate = By.xpath("//h4[text()='Currency Conversion Rate']");
		By custMsg = By.xpath("//h4[text()='Custom Messages']");
		By customers = By.xpath("//h4[text()='Customers']");
		By dataPackagerImport = By.xpath("//h4[text()='Data Packager Import']");
		By dpMaintenance = By.xpath("//h4[text()='Data Packager Maintenance']");
		By dgis = By.xpath("//h4[text()='DGIS Regulation']");
		By docMgr = By.xpath("//h4[text()='Document Manager']");
		By DwnLoad = By.xpath("//h4[text()='Downloads']");
		By epicorDM = By.xpath("//h4[text()='Epicor Data Mapping']");
		By emailTemplate = By.xpath("//h4[text()='Email Templates']");
		By exportLicense = By.xpath("//h4[text()='Export License']");
		By facilities = By.xpath("//h4[text()='Facilities']");
		By genCarrier = By.xpath("//h4[text()='Generic Carriers']");
		By hazGrp = By.xpath("//h4[text()='Hazmat Group']");
		By prods = By.xpath("//h4[text()='Products']");
		By proxySettings = By.xpath("//h4[text()='Proxy Settings']");
		By qMgr = By.xpath("//h4[text()='Query Manager']");
		By shipCode = By.xpath("//h4[text()='Ship Codes']");
		By shipChargeSchema = By.xpath("//h4[text()='Shipping Charge Schemes']");
		By triffCode = By.xpath("//h4[text()='Tariff Codes']");
		By Usr = By.xpath("//h4[text()='Users']");
		//System.out.println("Test Starts : "+ ts);
		
		
		StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        //long timeElapsedStart = date.getTime();
        
        //System.out.println("Execution time in milliseconds:" +date.getTime());
	     
	   // System.out.println(duration);
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

		// *************** Setup screen
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

		// *************** Setup screen >> Application Setting Page
		doClick(appSet);

		By h2_header_appsets = By.xpath("//h1[text()='Application Settings']");
		String cc1 = "Application Settings";

		System.out.print(driver.findElement(h2_header_appsets).getText());
		String str2 = driver.findElement(h2_header_appsets).getText();

		if (cc1.equals(str2)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >> BOL Class Page

		doClick(bolClass);

		By h1_header_bc = By.xpath("//h1[text()='BOL Class']");
		String bc1 = "BOL Class";

		System.out.print(driver.findElement(h1_header_bc).getText());
		String bc = driver.findElement(h1_header_bc).getText();

		if (bc1.equals(bc)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >> Carrier Xml Files Page

		doClick(cXMLfiles);

		By h1_header_cxf = By.xpath("//h1[text()='Carrier Xml Files']");
		String cxf1 = "Carrier Xml Files";

		System.out.print(driver.findElement(h1_header_cxf).getText());
		String cxf = driver.findElement(h1_header_cxf).getText();

		if (cxf1.equals(cxf)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >> Container Types Page

		doClick(conType);
		Thread.sleep(5000);

		By h1_header_ct = By.xpath("//h5[text()='Container Types']");
		String ct1 = "Container Types";

		System.out.print(driver.findElement(h1_header_ct).getText());
		String ct = driver.findElement(h1_header_ct).getText();

		if (ct1.equals(ct)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >>Currency Conversion Rate Page

		doClick(ccRate);

		By h1_header_ccr = By.xpath("//h1[text()='Currency Conversion Rate']");
		String ccr1 = "Currency Conversion Rate";

		System.out.print(driver.findElement(h1_header_ccr).getText());
		String ccr = driver.findElement(h1_header_ccr).getText();

		if (ccr1.equals(ccr)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >>Countries Page

		doClick(contry);
		Thread.sleep(1000);

		By h1_header_ctn = By.xpath("//h5[text()='Countries']");
		String ctn1 = "Countries";

		System.out.print(driver.findElement(h1_header_ctn).getText());
		String ctn = driver.findElement(h1_header_ctn).getText();

		if (ctn1.equals(ctn)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >>Custom Messages Page

		doClick(custMsg);

		By h1_header_cMsg = By.xpath("//h1[text()='Custom Messages']");
		String msg1 = "Custom Messages";

		System.out.print(driver.findElement(h1_header_cMsg).getText());
		String msg = driver.findElement(h1_header_cMsg).getText();

		if (msg1.equals(msg)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >>Customers Page

		doClick(customers);

		By h1_header_cust = By.xpath("//h5[text()='Customers']");
		String cust1 = "Customers";

		System.out.print(driver.findElement(h1_header_cust).getText());
		String cust = driver.findElement(h1_header_cust).getText();

		if (cust1.equals(cust)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >>Data Packager Import Page

		doClick(dataPackagerImport);
		Thread.sleep(5000);

		By h1_header_dp = By.xpath("//h1[text()='Data Package Import']");

		String dp1 = "Data Package Import";

		System.out.print(driver.findElement(h1_header_dp).getText());
		String dp = driver.findElement(h1_header_dp).getText();

		if (dp1.equals(dp)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >>Data Packager Maintenance Page

		doClick(dpMaintenance);
		Thread.sleep(5000);

		By h1_header_dpmTest = By.xpath("//h1[text()='Datapackager Maintenance']");
		String dpmTest1 = "Datapackager Maintenance";

		System.out.print(driver.findElement(h1_header_dpmTest).getText());
		String dpmTest = driver.findElement(h1_header_dpmTest).getText();

		if (dpmTest1.equals(dpmTest)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >>DGIS Regulation Page

		doClick(dgis);
		Thread.sleep(5000);

		By h1_header_dgisTest = By.xpath("//h1[text()='DGIS Regulation Manager']");
		String dgisTest1 = "DGIS Regulation Manager";

		System.out.print(driver.findElement(h1_header_dgisTest).getText());
		String dgisTest = driver.findElement(h1_header_dgisTest).getText();

		if (dgisTest1.equals(dgisTest)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >>Document Manager Page

		doClick(docMgr);
		Thread.sleep(5000);

		By h1_header_docMgr = By.xpath("//h1[text()='Document Manager']");
		String docMgrr1 = "Document Manager";

		System.out.print(driver.findElement(h1_header_docMgr).getText());
		String docMgrr = driver.findElement(h1_header_docMgr).getText();

		if (docMgrr1.equals(docMgrr)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >>Downloads Page

		doClick(DwnLoad);
		Thread.sleep(5000);

		By h1_header_dlTest = By.xpath("//h1[text()='Downloads']");
		String dl1 = "Downloads";

		System.out.print(driver.findElement(h1_header_dlTest).getText());
		String dlTest = driver.findElement(h1_header_dlTest).getText();

		if (dl1.equals(dlTest)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >>Epicor Data Mapping Page

		doClick(epicorDM);
		Thread.sleep(5000);

		By h1_header_eDMTest = By.xpath("//h1[text()='Epicor Data Mapping']");
		String eDM1 = "Epicor Data Mapping";

		System.out.print(driver.findElement(h1_header_eDMTest).getText());
		String eDMTest = driver.findElement(h1_header_eDMTest).getText();

		if (eDM1.equals(eDMTest)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >>Email Template Page

		doClick(emailTemplate);
		Thread.sleep(5000);

		By h1_header_emailTemp = By.xpath("//div[contains(text(),' Email Template ')]");
		String emailTemp1 = " Email Template ";

		System.out.print(driver.findElement(h1_header_emailTemp).getText());
		String emailTemp = driver.findElement(h1_header_emailTemp).getText();

		if (emailTemp1.equals(emailTemp)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >>Export License Page

		doClick(exportLicense);
		Thread.sleep(5000);

		By h1_header_exportLic = By.xpath("//h1[text()='Export License']");
		String exportLic1 = "Export License";

		System.out.print(driver.findElement(h1_header_exportLic).getText());
		String exportLic = driver.findElement(h1_header_exportLic).getText();

		if (exportLic1.equals(exportLic)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >>Facilities Page

		doClick(facilities);
		Thread.sleep(5000);

		By h1_header_facilityTest = By.xpath("//h1[text()='Facilities']");
		String facilityTest1 = "Facilities";

		System.out.print(driver.findElement(h1_header_facilityTest).getText());
		String facilityTest = driver.findElement(h1_header_facilityTest).getText();

		if (facilityTest1.equals(facilityTest)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >>Generic Carriers Page

		doClick(genCarrier);
		Thread.sleep(5000);

		By h1_header_genCarrierTest = By.xpath("//h2[text()='Generic Carriers']");
		String genCarrier1 = "Generic Carriers";

		System.out.print(driver.findElement(h1_header_genCarrierTest).getText());
		String genCarrierTest = driver.findElement(h1_header_genCarrierTest).getText();

		if (genCarrier1.equals(genCarrierTest)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >>Hazmat Group Page

		doClick(hazGrp);
		Thread.sleep(5000);

		By h1_header_hZGrpTest = By.xpath("//h1[text()='Hazmat Group']");
		String hZGrp1 = "Hazmat Group";

		System.out.print(driver.findElement(h1_header_hZGrpTest).getText());
		String hZGrpTest = driver.findElement(h1_header_hZGrpTest).getText();

		if (hZGrp1.equals(hZGrpTest)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >>Products Page

		doClick(prods);
		Thread.sleep(5000);

		By h1_header_prodsTest = By.xpath("//h1[text()='Products']");
		String prods1 = "Products";

		System.out.print(driver.findElement(h1_header_prodsTest).getText());
		String prodsTest = driver.findElement(h1_header_prodsTest).getText();

		if (prods1.equals(prodsTest)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >>Proxy Settings Page

		doClick(proxySettings);
		Thread.sleep(5000);

		By h1_header_prxySetTest = By.xpath("//h1[text()='Proxy Settings']");
		String prxySet1 = "Proxy Settings";

		System.out.print(driver.findElement(h1_header_prxySetTest).getText());
		String prxySetTest = driver.findElement(h1_header_prxySetTest).getText();

		if (prxySet1.equals(prxySetTest)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >>Query Manager Page

		doClick(qMgr);
		Thread.sleep(5000);

		By h1_header_queryMgrTest = By.xpath("//h2[text()='Query Manager']");
		String queryMgr1 = "Query Manager";

		System.out.print(driver.findElement(h1_header_queryMgrTest).getText());
		String queryMgrTest = driver.findElement(h1_header_queryMgrTest).getText();

		if (queryMgr1.equals(queryMgrTest)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >>Ship Codes Page

		doClick(shipCode);
		Thread.sleep(10000);

		By h1_header_shipViaCodeTest = By.xpath("//h2[text()='Ship Codes']");
		String shipViaCode1 = "Ship Codes";

		System.out.print(driver.findElement(h1_header_shipViaCodeTest).getText());
		String shipViaCodeTest = driver.findElement(h1_header_shipViaCodeTest).getText();

		if (shipViaCode1.equals(shipViaCodeTest)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >>Shipping Charge Scheme Page

		doClick(shipChargeSchema);
		Thread.sleep(5000);

		By h1_header_SCSTest = By.xpath("//h2[text()='Shipping Charge Schemes']");
		String SCS1 = "Shipping Charge Schemes";

		System.out.print(driver.findElement(h1_header_SCSTest).getText());
		String SCSTest = driver.findElement(h1_header_SCSTest).getText();

		if (SCS1.equals(SCSTest)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >>Tariff Codes Page

		doClick(triffCode);
		Thread.sleep(5000);

		By h1_header_codeTariff = By.xpath("//h1[text()='Tariff Codes']");
		String codeTariff1 = "Tariff Codes";

		System.out.print(driver.findElement(h1_header_codeTariff).getText());
		String codeTariff = driver.findElement(h1_header_codeTariff).getText();

		if (codeTariff1.equals(codeTariff)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		// *************** Setup screen >>Users Page

		doClick(Usr);
		Thread.sleep(5000);

		By h2_header_codeTariff = By.xpath("//h2[text()='User Management']");
		String usrTest1 = "User Management";

		System.out.print(driver.findElement(h2_header_codeTariff).getText());
		String usrTest = driver.findElement(h2_header_codeTariff).getText();

		if (usrTest1.equals(usrTest)) {
			System.out.print(": Heading matches : PASS " + " >> " + "URL is : " + driver.getCurrentUrl() + "\n");
		} else {
			System.out.println(" Heading mis-matches : FAIL");
		}

		doClick(home);
		doClick(setup);

		System.out.println("SetUp Page Links Working Fine====>> QA PASS");
		
		stopwatch.stop();    // Optional
		 
        long timeElapsed = stopwatch.getTime();
 
        System.out.println("Execution time in Seconds: " + timeElapsed/1000);
		//methodToTime();
		//Instant finish = Instant.now();
		//long timeElapsed = Duration.between(start, finish).toMillis();
		
		
		
//		 Date endDate = new Date();  
//         Timestamp eD=new Timestamp(date.getTime());  
//         System.out.println(eD); 
		
		driver.quit();
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