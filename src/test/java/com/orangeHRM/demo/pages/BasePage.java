package com.orangeHRM.demo.pages;

import com.orangeHRM.demo.loadableComponents.CustomLoadableComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends CustomLoadableComponent {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @Override
    public void load() {

    }

    @Override
    public void isLoaded() throws Error {

    }
}
