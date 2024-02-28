package pages;

import org.openqa.selenium.By;

import base.BaseTest;

public class PLogin extends BaseTest{
	
	public void loginM(String username, String password) {

		driver.get(prop.getProperty("testurl"));
		driver.findElement(By.id(loc.getProperty("username_field"))).sendKeys(username);
		driver.findElement(By.id(loc.getProperty("password_feild"))).sendKeys(password);
		driver.findElement(By.id(loc.getProperty("login_button"))).click();
	}

}
