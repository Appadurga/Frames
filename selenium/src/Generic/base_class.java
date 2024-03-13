package Generic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.fetch_property;

public class base_class implements framework_constant{
	public WebDriver driver;
	@BeforeMethod
	public void openappln() throws FileNotFoundException, IOException 
	{
		System.setProperty(c_keyString,c_valueString);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(fetch_property.fetchur1());
		
	
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}}

	


