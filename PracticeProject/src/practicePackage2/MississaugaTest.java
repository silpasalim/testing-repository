package practicePackage2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MississaugaTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.mississauga.ca/portal/home");
		
		WebElement Residents = driver.findElement(By.xpath("//img[@alt='Residents']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(Residents).build().perform();
		Thread.sleep(4000);
		
		List<WebElement> All = driver.findElements(By.xpath("//div[@id='tnNavResidentsMenu']//a"));
		System.out.println(All.size());
		for(WebElement a: All) {
			System.out.println(a.getText());
			if(a.getText().equals("Parking")) {
				a.click();
				break;
			}
		}
		
				
	}

}
