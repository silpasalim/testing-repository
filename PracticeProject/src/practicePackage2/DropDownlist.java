package practicePackage2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownlist {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		WebElement Sbox = driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> All = Sbox.findElements(By.xpath("//select[@id='searchDropdownBox']/option"));
		System.out.println(All.size());
		for(WebElement a : All) {
			if(a.isSelected()) {
			System.out.println(a.getText()+"------------------"+a.isSelected());
		}
		

	}
		Select S = new Select(Sbox);
		//S.selectByIndex(4);
		S.selectByVisibleText("Amazon Devices");
		for(WebElement a : All) {
			
			System.out.println(a.getText()+"------------------"+a.isSelected());
		
		}
}
}
