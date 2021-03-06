package SeleniumWaits;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VisibilityOfElements {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		By footerLinks = By.xpath("//ul[@class='footer-nav']//a");
				
		System.out.println(getPageLinksText(footerLinks, 10));
	}
	
	public static List<WebElement> visibilityOfAllElements(By locator, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public static List<Object> getPageLinksText(By locator, int timeOut){
		//visibilityOfAllElements(locator, timeOut).stream().forEach(ele -> System.out.println(ele.getText()));
		 return visibilityOfAllElements(locator, timeOut).
		stream().filter(ele -> !ele.getText().contains(" ")).map(ele -> ele.getText()).collect(Collectors.toList());
	}
	

}
