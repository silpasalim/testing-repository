package practicePackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookSignUpTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("lastname")).sendKeys("sdfdfadfdf");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567898");
		driver.findElement(By.name("reg_passwd__")).sendKeys("weqwewqeqwe");
	}

}
