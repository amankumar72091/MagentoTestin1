

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home 
{
	WebDriver driver;
	public Home(WebDriver driver)
	{
		super();
		this.driver=driver;
	}
	By logout = By.linkText("Log Out");//has
	public void clickOnToLogOut()
	{
		driver.findElement(logout).click();
	}
}
