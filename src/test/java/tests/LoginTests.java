package tests;

import base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseClass {

    public LoginTests(WebDriver driver) {
        this.driver = driver;
    }

    @Test
    public void testValidLogin(){
        LoginPage login = new LoginPage(driver);
        login.enterUserName("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLoginButton();

        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Test
    public void testInvalidLogin(){
        LoginPage login = new LoginPage(driver);
        login.enterUserName("asdfgtfcxcvbng");
        login.enterPassword("1234567890");
        login.clickLoginButton();
    }
}