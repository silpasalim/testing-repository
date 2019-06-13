package practicePackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumPracticeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("esgfdshdfgkg");
		driver.findElement(By.id("pass")).sendKeys("aeahgasdhsh");
		driver.findElement(By.id("loginbutton")).click();

	}
	}

