package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Ankita
 */
public class CustomersPage extends Utility {
    By searchCustomerBt = By.xpath("//input[@placeholder='Search Customer']");
    By deleteBt = By.xpath("//button[contains(text(),'Delete')]");
    By yourNameLink = By.id("userSelect");
    By selectNameFromList = By.xpath("//option[contains(text(),'Hermoine Granger')]");
    By loginButton = By.xpath("//button[@class='btn btn-default']");
    By getYourNameText = By.xpath("//label[contains(text(),'Your Name :')]");


    public void clickOnYourName() {
        clickOnElement(yourNameLink);
    }

    public void clickOnSelectName() {
        clickOnElement(selectNameFromList);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getYourNameMessage() {
        return getTextFromElement(getYourNameText);

    }
    public void searchCustomerByName(String name){
        sendTextToElement(searchCustomerBt, name);
    }

    public void deleteCustomer(){
        clickOnElement(deleteBt);
    }


}
