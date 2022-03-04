package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    WebDriver driver;
    Utils utils;

    By gender = By.id("gender-female");
    By fname = By.id("FirstName");
    By lname = By.id("LastName");
    By days = By.name("DateOfBirthDay");
    By months= By.name("DateOfBirthMonth");
    By years = By.name("DateOfBirthYear");
    By email = By.id("Email");
    By cmpName = By.id("Company");
    By pwd = By.id("Password");
    By confirmPwd = By.id("ConfirmPassword");
    By regButton = By.id("register-button");

    public RegistrationPage(WebDriver driver){
        this.driver=driver;
        utils=new Utils(driver);
    }
    public void doRegistration(String firstname, String lastname,String emailId,
                               String companyName,String password,String confirmPassword){
        utils.doClick(gender);
        utils.doSendKeys(fname,firstname);
        utils.doSendKeys(lname,lastname);
        utils.selectValueFromDropDown(days,"15");
        utils.selectValueFromDropDown(months,"October");
        utils.selectValueFromDropDown(years,"1989");
        utils.doSendKeys(email,emailId);
        utils.doSendKeys(cmpName,companyName);
        utils.doSendKeys(pwd,password);
        utils.doSendKeys(confirmPwd,confirmPassword);
        utils.doClick(regButton);
    }
}
