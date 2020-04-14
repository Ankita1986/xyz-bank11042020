package actionclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class TestDragAndDrop {
   private WebDriver driver;
   private String baseUrl = "https://jqueryui.com/resources/demos/droppable/default.html";

    @Before
    public void openBrowser() {
        //String baseUrl = "https://jqueryui.com/resources/demos/droppable/default.html";

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test
    public void dragAndDropExample() {
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggable, droppable).perform();
    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }


}
