package practicePackage2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AdidasMouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en");
		WebElement men = driver.findElement(By.xpath("//a[@manual_cm_sp='header-_-Men']"));
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(men).build().perform();
		WebElement box = driver.findElement(By.xpath("(//div[@class='col-5'])[2]"));
		List<WebElement> All = box.findElements(By.xpath("(//div[@class='col-5'])[2]//li"));
		System.out.println(All.size());
		for(WebElement a : All) {
			System.out.println(a.getText());
		}
		
	
		
		
		
	}

}
