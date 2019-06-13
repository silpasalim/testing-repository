package practicePackage2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.findElement(By.xpath("//button[contains(@onclick,'pushConfirm()')]")).click();
		Thread.sleep(5000);
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		
	}

}
