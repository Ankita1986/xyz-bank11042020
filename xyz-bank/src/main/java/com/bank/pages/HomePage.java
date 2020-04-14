package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Ankita
 */
public class HomePage extends Utility {
    By homeBtLink = By.xpath("//button[@class='btn home']");
    By customerLoginLink = By.xpath("//button[contains(text(),'Customer Login')]");
    By bankManagerLoginLink = By.xpath("//button[contains(text(),'Bank Manager Login')]");

    public  void clickOnCustomerLogin(){
        clickOnElement(customerLoginLink);
    }
    public void clickOnBankManagerLogin(){
        clickOnElement(bankManagerLoginLink);
    }
    public void clickOnHomeBt(){
        clickOnElement(homeBtLink);
    }
}
