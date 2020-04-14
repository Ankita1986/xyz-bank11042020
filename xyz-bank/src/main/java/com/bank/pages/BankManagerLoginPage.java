package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Ankita
 */
public class BankManagerLoginPage extends Utility {
    By addCustomerTab = By.xpath("//button[contains(text(),'Add Customer')]");
    By openAccountTab = By.xpath("//button[contains(text(),'Open Account')]");
    By customersTab = By.xpath("//button[contains(text(),'Customers')]");
    By homeBtLink = By.xpath("//button[@class='btn home']");

    public void clickOnAddCustomerTab(){
        waitUntilElementToBeClickable(addCustomerTab, 30);
        clickOnElement(addCustomerTab);

    }
    public void clickOnOpenAccountTab(){
        waitUntilElementToBeClickable(openAccountTab, 30);
        clickOnElement(openAccountTab);
    }
    public void clickOnCustomerTab(){
        clickOnElement(customersTab);
    }
    public void clickOnHomeBt(){
        clickOnElement(homeBtLink);
    }

}
