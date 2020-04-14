package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Ankita
 */
public class CustomerLoginPage extends Utility {
    By yourName = By.xpath("//select[@id='userSelect']");
    By loginBt = By.xpath("//button[@class='btn btn-default']");
    By yourNameLabel = By.xpath("//label[contains(text(),'Your Name :')]");
    By getLogoutButton = By.xpath("//button[@class='btn logout']");
    By clickLogoutButton = By.xpath("//button[@class='btn logout']");





    public void clickOnLoginBt() {
        clickOnElement(loginBt);
    }

    public void selectCustomerNameFromDropDown(String Name) {
        clickOnElement(yourName);
        selectByVisibleTextForDropDownElement(yourName, Name);

    }
    public boolean isYourNameLabelDisplayed(){
        if (getElement(yourNameLabel).isDisplayed()){
            return true;
        }else {
            return false;
        }
    }



    public String getLogoutFeature() {
        return getTextFromElement(getLogoutButton);
    }

    public void clickLogoutFeature() {
        clickOnElement(clickLogoutButton);
    }
}
