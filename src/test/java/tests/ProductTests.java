package tests;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;

public class ProductTests extends BaseClass {

    @Test
    public void productTests() {

        LoginTests loginTest = new LoginTests(driver);
        loginTest.testValidLogin();

        ProductPage product = new ProductPage(driver);
//        System.out.println(product.areAllProductsDisplayed());
        Assert.assertTrue(product.areAllProductsDisplayed());
        product.clickCartButton();
        product.clickProduct();
        product.clickBackToProducts();

//        String expectedUrl = "https://www.saucedemo.com/inventory.html";
//        String actualUrl = driver.getCurrentUrl();

//        Assert.assertEquals(actualUrl, expectedUrl);

    }
}
