

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome 
{
	WebDriver driver;
	public Welcome(WebDriver driver)
	{
		super();
		this.driver=driver;
	}
	By myacc = By.linkText("My Account");//has
	public void clickMyAccount()
	{
		driver.findElement(myacc).click();
	}
}
