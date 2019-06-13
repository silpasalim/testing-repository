package practicePackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("lastname")).sendKeys("Silma");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.name("reg_passwd__")).sendKeys("dggffgfafaga");
		
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByVisibleText("Jan");
		
		
		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		d.selectByVisibleText("23");
		
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByVisibleText("1992");
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();
		driver.findElement(By.name("websubmit")).click();
		
		String expected = "What’s your name?";
		String actual = driver.findElement(By.xpath("//div[@class='_5633 _5634 _53ij']")).getText();
		if(expected.equals(actual)) {
			System.out.println("Test Passed");
			
		}else {
			System.out.println("Test Failed");
			
		}
		}
		
		
		
	

}
