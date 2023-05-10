package Testes.Desafio.Ui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckOut {
    @BeforeAll
    public static void beforeAll() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
    }

    private WebDriver browser;

    @BeforeEach
    public void beforeEach() {
        this.browser = new ChromeDriver();
        browser.navigate().to("https://www.saucedemo.com");
    }

    @AfterEach
    public void afterEach() {
        this.browser.quit();

    }

    @Test
    public void FinalizarCompra() {
        browser.findElement(By.id("user-name")).sendKeys("standard_user");
        browser.findElement(By.id("password")).sendKeys("secret_sauce");
        browser.findElement(By.id("login-button")).submit();
        browser.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        browser.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        browser.findElement(By.className("shopping_cart_link")).click();
        browser.findElement(By.id("checkout")).click();
        browser.findElement(By.id("first-name")).sendKeys("Kelton");
        browser.findElement(By.id("last-name")).sendKeys("Montinegro");
        browser.findElement(By.id("postal-code")).sendKeys("05144085");
        browser.findElement(By.id("continue")).click();
        browser.findElement(By.id("finish")).click();

    }



}
