package practicePackage2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSugestionList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		driver.findElement(By.id("uh-search-box")).sendKeys("canada");
		Thread.sleep(4000);
		List<WebElement> All = driver.findElements(By.xpath("//div[@class='assistjs-tray yui3-aclist ua-ie9_Pos(r)']//li"));
		System.out.println(All.size());
		for(WebElement a : All) {
			System.out.println(a.getText());
			
		}
		
		
		
		
	}	

}
