package seleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestFindFirstElement {
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
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
        System.out.println(errormsg.getText());

        WebElement rememberMe = driver.findElement(By.xpath("//label[contains(text(),'Remember me?')]"));
        rememberMe.click();

    }








}
