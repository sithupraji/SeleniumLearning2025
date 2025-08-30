package Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;


public class baseTest {
	
protected WebDriver driver;

@BeforeMethod	
public void setup()
{
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://admin-demo.nopcommerce.com/login");
}
@AfterMethod
public void teardown() {
	//if(driver!=null)
	//driver.close();
}
}
