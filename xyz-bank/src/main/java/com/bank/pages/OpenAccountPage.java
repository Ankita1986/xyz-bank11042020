package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Ankita
 */
public class OpenAccountPage extends Utility {
   // By openAccountLink = By.xpath("//button[contains(text(),'Open Account')]");
    By customerName = By.xpath("//select[@id='userSelect']");
   // By selectCustomerName = By.xpath("//option[contains(text(),'Hermoine Granger')]");
    By currency = By.id("currency");
   // By currencyPound = By.xpath("//option[contains(text(),'Pound')]");
    By clickOnProcess = By.xpath("//button[contains(text(),'Process')]");


    public void selectCustomerName(String cName){
        selectByVisibleTextForDropDownElement(customerName, cName);
    }

    public void selectCurrency(String currency){
        selectByVisibleTextForDropDownElement(this.currency, currency);
    }

    public void clickOnProcessButton(){
        clickOnElement(clickOnProcess);
    }







}


