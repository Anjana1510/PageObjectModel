package com.nopcommerce.tests;

import com.nopcommerce.demo.base.BasePage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Properties;

public class HomePageTest {
    BasePage basePage;
    Properties prop;
    WebDriver driver;
    HomePage homePage;

    @BeforeTest
    public void openBrowser() {
        basePage = new BasePage();
        prop = basePage.initializeProperties();
        String browser = prop.getProperty("browser");
        driver = basePage.initializeDriver(browser);
        driver.get(prop.getProperty("url"));
        homePage = new HomePage(driver);
    }

    @Test
    public void registerButtonClick(){
        homePage.clickRegisterButton();

    }
}


