package practicePackage2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		if(sortable.size()>0) {
			System.out.println("Sortable present");
		}else {
			System.out.println("Sortable not Present");
		}
		
		
		List<WebElement> draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if(draggable.size()>0) {
			System.out.println("draggable present");
		}else {
			System.out.println("draggable not Present");
		}
		
		
		driver.switchTo().frame(0);
		System.out.println("------------After switching to frame--------");
		
		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		if(sortable.size()>0) {
			System.out.println("Sortable present");
		}else {
			System.out.println("Sortable not Present");
		}
		
		
		draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if(draggable.size()>0) {
			System.out.println("draggable present");
		}else {
			System.out.println("draggable not Present");
		}
		
		
		driver.switchTo().defaultContent();
		System.out.println("------------After switching back to main--------");
		
		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		if(sortable.size()>0) {
			System.out.println("Sortable present");
		}else {
			System.out.println("Sortable not Present");
		}
		
		
		draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if(draggable.size()>0) {
			System.out.println("draggable present");
		}else {
			System.out.println("draggable not Present");
		}
		
	}

}
