package practicePackage2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotTest {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:/SeleniumJars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.mississauga.ca/portal/home");
		
		File scrFile = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\\\testing\\\\screenshot1.png"));
		
	}

}
