package tests;

import base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Logout;

public class LogoutTests extends BaseClass {

    @Test
    public void LogoutTest(){
        LoginTests loginTest = new LoginTests(driver);
        loginTest.testValidLogin();

        Logout logout = new Logout(driver);
        logout.clickMenuButton();
        logout.clickLogoutButton();

        String expectedUrl = "https://www.saucedemo.com/";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);

    }
}
