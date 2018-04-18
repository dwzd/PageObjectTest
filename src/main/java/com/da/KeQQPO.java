package com.da;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeQQPO extends BasicPO {
    //public WebDriver driver;
    public static By searchInput = By.id("js_keyword");
    public static By searchButton = By.id("js_search");

    public KeQQPO(WebDriver driver){
        this.driver = driver;
        url = "https://ke.qq.com";
        driver.get(url);
    }

    public void keSearch(String keywords){
//        driver.findElement(searchInput).sendKeys(keywords);
//        driver.findElement(searchButton).click();
        this.findelement(searchInput,10).sendKeys(keywords);
        this.findelement(searchButton,10).click();
    }
}
