package seleniumPractice2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    private WebDriver driver;

    @Before
    public void openBrowser() {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

    }

    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        loginlink.click();
        WebElement welcomeText = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!"));

        String expectedText = "Welcome, Please Sign In!";
        String actualText = welcomeText.getText();
        Assert.assertEquals(expectedText, actualText);

    }
    @Test
    public void verifyErrorMessageWhenWrongUserNameIsEntered() throws InterruptedException {
        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        loginlink.click();
        Thread.sleep(2000);// not recommennd to use

        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("abcd@yahoo.com");

        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("abc123");
        // syntax : //tag[@attribute='value']

        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
        loginButton.click();

        WebElement errormsg = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));

        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.";
        String actualErrorMessage= errormsg.getText();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);

    }

    @After
    public void closeBrowser() {
        driver.quit();

    }

}
