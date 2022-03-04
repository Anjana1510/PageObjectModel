package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    Utils utils;

    By register = By.className("ico-register");

    public HomePage(WebDriver driver){
        this.driver=driver;
        utils = new Utils(driver);
    }

    public RegistrationPage clickRegisterButton(){
        utils.doClick(register);
        return new RegistrationPage(driver);
        }

    }
