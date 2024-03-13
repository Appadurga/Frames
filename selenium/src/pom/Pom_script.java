package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic.Base_page;

public class Pom_script extends Base_page {
	@FindBy(id="email")
	 private WebElement uName;
	@FindBy(id="pass")
	private WebElement pname;
	@FindBy(name="login")
	private WebElement bname;
	
	public Pom_script(WebDriver driver) {
		super(driver);
		
	}
	public void passData(String name) {
		uName.sendKeys(name);
		
	}
	public void passData1(String pass) {
		pname.sendKeys(pass);
		
	}
	public void passData2() {
		bname.click();
		
	}
}
