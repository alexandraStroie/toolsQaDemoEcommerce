package com.orangeHRM.demo.loadableComponents;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IsLoaded {

    public static IsLoaded forThis() {
        return new IsLoaded();
    }

    public IsLoaded whenElementIsVisible(WebDriver driver, WebElement element, String description) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(element));
            return this;
        } catch (NoSuchElementException e) {
            throw new AssertionError(description + " is not visible " + e);
        }
    }

    public void whenTitleIsDisplayed(WebDriver driver, String value, String description) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.titleIs(value));
        } catch (NoSuchElementException e) {
            throw new AssertionError(description + " is not visible " + e);
        }
    }

}
