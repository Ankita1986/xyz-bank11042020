package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Ankita
 */
public class AccountPage extends Utility {
    By depositLink = By.xpath("//button[contains(text(),'Deposit')]");
   // By amountToBeDepositedLink = By.xpath("//input[@placeholder='amount']");
    By depositButton = By.xpath("//button[@class='btn btn-default']");
    By getTextDepositSuccessful = By.xpath("//span[@class='error ng-binding']");
    By amountToBeWithdrawn = By.xpath("//input[@placeholder='amount']");
    By withdrawBt = By.xpath("//button[@class='btn btn-default']");
    By getTransactionText = By.xpath("//span[@class='error ng-binding']");
    By withdrawalLink = By.xpath("//button[contains(text(),'Withdrawl')]");
    By logOutBtn = By.xpath("//button[@class='btn logout']");
    By errorMessage = By.xpath("//span[@class='error ng-binding']");
    By homeBtLink = By.xpath("//button[@class='btn home']");

    public void clickOnHomeBt(){
        clickOnElement(homeBtLink);
    }





    public void clickOnDepositButton() {
        clickOnElement(depositLink);
    }

    public void enterAmountToDeposit(int amount) {
        sendTextToElement(this.amountToBeWithdrawn, String.valueOf(amount));

    }

    public void clickDepositFeature() {
        clickOnElement(depositButton);
    }

    public String getTextDepositSuccessfulMessage() {
        return getTextFromElement(getTextDepositSuccessful);
    }

    public void clickOnWithdrawalTab() {
        clickOnElement(withdrawalLink);
    }

    public void enterAmountToWithdrawl( String amount) {
        sendTextToElement(amountToBeWithdrawn, amount);
    }

    public void clickOnWithdrawFeature() {
        clickOnElement(withdrawBt);
    }

    public String getTextTransaction() {
        return getTextFromElement(getTransactionText);
    }
    public void clickOnLogoutButton(){
        clickOnElement(logOutBtn);
    }

    public boolean isLogoutButtonDisplayed(){
        if (getElement(logOutBtn).isDisplayed()){
            return true;
        }else {
            return false;
        }
    }
    public String getErrorSuccessMessage(){
        return getTextFromElement(errorMessage);
    }

}
