package com.orangeHRM.demo.steps;

import com.orangeHRM.demo.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertTrue;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.load();
    }

    @When("the user enters a valid username and password")
    public void theUserEntersAValidUsernameAndPassword() {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
    }

    @When("the user clicks the login button")
    public void theUserClicksTheLoginButton() {
        loginPage.clickLoginButton();
    }

//    @Then("the user should be redirected to the dashboard page")
//    public void theUserShouldBeRedirectedToTheDashboardPage() {
//        assertTrue(loginPage.isLoggedIn());
//        driver.quit();
//    }
}