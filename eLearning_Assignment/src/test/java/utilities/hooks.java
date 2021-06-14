package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
public static WebDriver driver;

@Before
public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\SDET_Training\\softwares\\chromedriver.exe");
	System.out.println("Browser Launched - calling from hooks.java");
	driver = new ChromeDriver();
	
}
@After
public void closeBrowser() {
	
	driver.quit();
	System.out.println("Browser and Chromer Driver closed - calling from hooks.java");
}

}
