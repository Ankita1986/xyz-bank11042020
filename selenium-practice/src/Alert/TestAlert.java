package Alert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestAlert {
    private String baseUrl = "https://jqueryui.com/resources/demos/slider/default.html";
    private WebDriver driver;

    @Before
    public void openBrowser() throws InterruptedException {

        String baseUrl = "https://jqueryui.com/resources/demos/slider/default.html";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test
    public void sliderExample() {
        WebElement mainSlider = driver.findElement(By.xpath("//div[@id='slider']"));
        int width = mainSlider.getSize().width;
        int halfWidth = width/2;

        /*driver.findElement(By.name("proceed")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();*/
        WebElement slider= driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slider,200,0).perform();
    }

    @After
    public void closeBrowser() throws InterruptedException {


        Thread.sleep(3000);
        driver.close();
    }
}


