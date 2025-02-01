package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Saucedemo_Test {
    public static void main(String[] args) {
        // Set up WebDriver and initialize Chrome browser
        WebDriver driver = new ChromeDriver();
        
        // Open SauceDemo login page
        driver.get("https://www.saucedemo.com/");
        
        // Perform login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        
        // Assert page title after login
        String headerText = driver.findElement(By.className("title")).getText();
        Assert.assertEquals(headerText, "Products", "Login failed! Expected 'Products' page not found.");


        // Add item to cart
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();

        // Open cart page
        driver.findElement(By.cssSelector("#shopping_cart_container a")).click();
        
        // Wait for page to load (replace with WebDriverWait for better handling)
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }

        // Assert that "Sauce Labs Backpack" is in the cart
        String actualText = driver.findElement(By.className("inventory_item_name")).getText();
        Assert.assertTrue(actualText.contains("Sauce Labs Backpack"), "Expected text 'Sauce Labs Backpack' not found!");

        // Proceed to checkout
        driver.findElement(By.cssSelector("#checkout")).click();
        
        // Fill in checkout details
        driver.findElement(By.id("first-name")).sendKeys("Nitin");
        driver.findElement(By.id("last-name")).sendKeys("Padal");
        driver.findElement(By.id("postal-code")).sendKeys("764039");
        driver.findElement(By.id("continue")).click();
        
        // Complete the purchase
        driver.findElement(By.id("finish")).click();
      
        // Validate order completion message
        String confirmationText = driver.findElement(By.cssSelector("#checkout_complete_container")).getText();
        Assert.assertTrue(confirmationText.contains("Thank you for your order!"), "Expected text 'Thank you for your order!' not found!");
        
        // Close the browser
        driver.quit();
    }
}