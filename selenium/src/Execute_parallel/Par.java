package Execute_parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Par {
	public WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void log(String browser) {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./software/gecko.exe");
		if(browser.equals("firefox"))
				{
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
				}else {
					driver=new ChromeDriver();
					driver.get("https://www.facebook.com/");
					
				}
}
}