package com.nopcommerce.tests;

import com.nopcommerce.demo.base.BasePage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegistrationPage;
import com.nopcommerce.demo.utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Properties;

public class RegistrationPageTest {
    WebDriver driver;
    Properties prop;
    BasePage basePage;
    RegistrationPage registrationPage;
    HomePage homePage;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        basePage = new BasePage();
        prop = basePage.initializeProperties();
        String browser = prop.getProperty("browser");
        driver = basePage.initializeDriver(browser);
        driver.get(prop.getProperty("url"));
        registrationPage = new RegistrationPage(driver);
        Thread.sleep(1000);
        homePage= new HomePage(driver);
        registrationPage = homePage.clickRegisterButton();
        Thread.sleep(1000);
    }
    @Test
    public void registrationTest(){
    registrationPage.doRegistration(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("email"),
        prop.getProperty("companyName"),prop.getProperty("password"), prop.getProperty("confirmPassword"));
    }
}

