package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

/**
 * Created by Ankita
 */
public class AddCustomerPage extends Utility {
   // By addCustomerTab = By.xpath("//button[@class='btn btn-lg tab btn-primary']");
    By firstNameField = By.xpath("//input[@placeholder='First Name']");
    By lastNameField = By.xpath("//input[@placeholder='Last Name']");
    By postCodeField = By.xpath("//input[@placeholder='Post Code']");
    By addCustomerBt = By.xpath("//button[@class='btn btn-default']");



    public void enterFirstName(String firstName){
        sendTextToElement(firstNameField, firstName);

    }
    public void enterLastName(String lastName){
        sendTextToElement(lastNameField, lastName);
    }
    public void enterPostCode(String postcode){
        sendTextToElement(postCodeField, postcode);
    }
    public void clickOnAddCustomerBt(){
        clickOnElement(addCustomerBt);
    }


}
