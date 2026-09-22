package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage {
    private WebDriver driver;
    private By productImages = By.className("inventory_item_img");
    private By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    private By productDisplay = By.id("item_4_img_link");
    private By backToProduct = By.id("back-to-products");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean areAllProductsDisplayed() {
        List<WebElement> products = driver.findElements(productImages);

        for (WebElement product : products) {
            if(!product.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public void clickCartButton() {
        driver.findElement(addToCartButton).click();
    }
    public void clickProduct() { driver.findElement(productDisplay).click(); }
    public void clickBackToProducts() { driver.findElement(backToProduct).click(); }
}
