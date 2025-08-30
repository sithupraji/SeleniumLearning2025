package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	 private WebDriver driver;
	
//	 private By userName = By.id("Email");
//	 private By passWord = By.id("Password");
//	 By.tagName("Log in");
	    private By usernameField = By.id("Email");
	    private By passwordField = By.id("Password");
	    private By loginButton = By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button");
	    
	    
	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }
	    public void enterUsername(String username) {
	    	driver.findElement(usernameField).clear();
	        driver.findElement(usernameField).sendKeys(username);
	    }
	    public void enterPassword(String password) {
	    	driver.findElement(passwordField).clear();
	        driver.findElement(passwordField).sendKeys(password);
	    }
	    public void clickLogin() {
	        driver.findElement(loginButton).click();
	    }
	}


