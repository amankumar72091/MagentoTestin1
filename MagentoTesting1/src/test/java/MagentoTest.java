

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class MagentoTest {

	@Test
	public void posCre() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		
		Welcome w = new Welcome(driver);
		w.clickMyAccount();
		
		Login l = new Login(driver);
		l.typeEmail("ihassan395@gmail.com");
		l.typePwd("Welcome@123");
		l.clickLogin();
		
		Home h = new Home(driver);
		h.clickOnToLogOut();
	}

}
