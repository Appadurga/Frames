package Generic;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class generate_photo {
       public static void get_photo(WebElement ele, String txt)
	{File tmpFile=ele.getScreenshotAs(OutputType.FILE);
	File pmtFile=new File("./element_photo/"+txt+".jpg");
	try {
		FileHandler.copy(tmpFile,pmtFile);
	} catch (Exception e) {
		System.out.println("File not found");
		e.printStackTrace();
	}}}
public class capture_screenshot
{
	public static void name(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start--maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/");  
		Thread.sleep(3000);
	}
			
		
	}
}