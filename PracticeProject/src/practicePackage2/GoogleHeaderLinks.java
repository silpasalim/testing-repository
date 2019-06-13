package practicePackage2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleHeaderLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebElement gHead = driver.findElement(By.xpath("//div[@id='gb']//a"));
		List<WebElement> all = gHead.findElements(By.xpath("//div[@id='gb']//a"));
		System.out.println(all.size());
		for(WebElement a : all) {
			System.out.println(a.getText());
		}
		
		
		
		
		
		

	}

}
