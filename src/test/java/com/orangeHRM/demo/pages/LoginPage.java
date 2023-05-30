package com.orangeHRM.demo.pages;

import com.orangeHRM.demo.loadableComponents.IsLoaded;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(css = ".orangehrm-login-button")
    private WebElement loginButton;
    public LoginPage(WebDriver driver) {
        super(driver);
    }


    @Override
    public void load() {
        // Load the login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Override
    public void isLoaded() throws Error {
        // Check if the login page is loaded
        IsLoaded.forThis().whenTitleIsDisplayed(driver,"Login","Login");
    }

    public void enterUsername(String userName) {
        usernameField.sendKeys(userName);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }
}
