package practicePackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AtributrTestAndChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/SeleniumJars/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String SearchLabel = driver.findElement(By.xpath("//input[@class='LM6RPg']")).getAttribute("placeholder");
		System.out.println(SearchLabel);
		
	}

}
