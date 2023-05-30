package com.orangeHRM.demo.steps;


import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Hooks {
    public static WebDriver driver;
    public static String baseURL;

    @Before
    public void setUp() throws IOException {
        // Load config.properties
        Properties config = new Properties();
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("config.properties");
        config.load(inputStream);

        // Get baseURL
        baseURL = config.getProperty("baseURL");

        // Setup WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Navigate to baseURL
        driver.get(baseURL);
    }
}
