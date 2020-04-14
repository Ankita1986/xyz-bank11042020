package seleniumbrowsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserTesting {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.ie.driver", "Drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        String title = driver.getTitle();
        System.out.println("Main page" + title);
        //driver.quit();


    }
}
