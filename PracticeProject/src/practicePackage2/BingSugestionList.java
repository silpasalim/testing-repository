package practicePackage2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BingSugestionList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.bing.com/");
		WebElement box = driver.findElement(By.xpath("//input[@id='sb_form_q']"));
		box.sendKeys("canada");
		Thread.sleep(3000);
	
		List<WebElement> all = driver.findElements(By.xpath("//ul[@id='sa_ul']/li"));
		System.out.println(all.size());
		for(WebElement a: all) {
			System.out.println(a.getText());
		}
		
		
		

	}

}
