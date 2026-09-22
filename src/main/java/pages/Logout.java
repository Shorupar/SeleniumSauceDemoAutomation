package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
    private WebDriver driver;
    private By clickMenuButton = By.id("react-burger-menu-btn");
    private By logout = By.id("logout_sidebar_link");

    public Logout(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMenuButton() {
        driver.findElement(clickMenuButton).click();
    }
    public void clickLogoutButton() {
        driver.findElement(logout).click();
    }
}
