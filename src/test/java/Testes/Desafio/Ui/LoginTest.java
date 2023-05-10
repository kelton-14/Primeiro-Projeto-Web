package Testes.Desafio.Ui;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
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
    public void DeveEfetuarLoginComDadosValidos() {
        browser.findElement(By.id("user-name")).sendKeys("standard_user");
        browser.findElement(By.id("password")).sendKeys("secret_sauce");
        browser.findElement(By.id("login-button")).submit();

    }



}
