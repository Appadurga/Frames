package Runnerscript;

import org.openqa.selenium.WebDriver;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import java.util.Properties;

import Generic.base_class;
import pom.Pom_script;


public class runner_script extends base_class {
	@Test(dataProvider = "test1")
	public void loginI(String un,String pwd) 
	{
		
		Pom_script p1=new Pom_script(driver);
		p1.passData(un);
        p1.passData1(pwd);
			p1.passData2();
	
	}
	@DataProvider(name="test1")
	public Object[][] createData1()
	{return new Object[][]
			{
		{"santhosh","123"},
		{"pradeep","456"},
	
			};}
}
