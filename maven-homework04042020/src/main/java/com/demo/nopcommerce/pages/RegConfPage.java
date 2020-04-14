package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Ankita
 */
public class RegistrationConformationPage extends Utility {
    By registertext = By.xpath("String actualText = loginPage.getWelcomeText();\n" +
            "        Assert.assertEquals(expectedText, actualText);");
}
