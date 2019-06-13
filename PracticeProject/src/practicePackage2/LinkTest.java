package practicePackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/SeleniumJars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.linkText("Business")).click();
		driver.findElement(By.partialLinkText("Busi")).click();
		Thread.sleep(5000);
		String expectedTitle = "Business Management Software | Google Business Solutions – Google";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		
	}	

}
