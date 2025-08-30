package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.baseTest;
import Pages.LoginPage;

public class LoginTest extends baseTest{
	
	@Test
public void testValidLogin() {
		LoginPage loginPage=new LoginPage(driver);
		
		loginPage.enterUsername("admin@yourstore.com");
		loginPage.enterPassword("admin");
		loginPage.clickLogin();
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Dashboard / nopCommerce administration");
	}
	
	
}
	

