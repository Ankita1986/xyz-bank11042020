package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/*
 Assignment:
If we change the browser=chrome than chrome browser will open,
if browser=firefox firefox will open and
if browser=ie, IE browser will open
else message "the wrong browser"

Hint:
Do this in the selenium-practice project.
In "browsertesting" package create class "MultiBrowserTesting".
1. Create one static variable string type name "browser" and assign value "chrome"
2. Create second static variable string type name "baseUrl" and assign value "https://demo.nopcommerce.com/"
3. Create a third static variable name "driver" type WebDriver.

Now use logic if else in the main method to achieve the above assignment.
  static variable non primitive data types
     */
public class MultiBrowserTesting {
    static String browser = "chrome";
    static String baseUrl = "https://demo.nopcommerce.com/";
    static String driver = "WebDriver";


    public static void main(String[] args) {
        /*
        below program is if else nested statement for finding browser and open browser from one
        of the browser from chrome, firefox or internet explore.
         */

        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(baseUrl);
        } else if (browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get(baseUrl);
        } else if (browser.equals("ie")) {
            System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
            WebDriver driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
            driver.get(baseUrl);
        } else {
            System.out.println("Browser are not available ");
        }


    }
}
