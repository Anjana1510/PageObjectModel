package com.nopcommerce.demo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utils {

    WebDriver driver;

    public Utils(WebDriver driver){
        this.driver=driver;
    }

    public WebElement getElement(By locator){
    WebElement element = driver.findElement(locator);
    return element;
    }

    public void doClick(By locator){
    getElement(locator).click();

    }
    public void doSendKeys(By locator, String values){
        getElement(locator).sendKeys(values);
    }

    public void selectValueFromDropDown(By locator, String value){
    Select select = new Select(getElement(locator));
    select.selectByVisibleText(value);
    }
}
