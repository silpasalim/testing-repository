package practicePackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath ("//input[@name='lastname']")).sendKeys("dgfdhdhdasa");
		//driver.findElement(By.xpath("//*[@type='text']")).sendKeys("firstname");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("etyreyryv");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567891");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("dgsfdfhdg");
		//driver.findElement(By.xpath("//button[@name='websubmit']")).click();	
		driver.findElement(By.xpath("//h2[contains(text(),'Sign Up')]")).click();
		
				
			
	}

}
