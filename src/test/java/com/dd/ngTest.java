package com.dd;

import com.da.GooglePO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ngTest {
    public static WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    public void searchTest(){
        GooglePO ggpo = new GooglePO(driver);
        ggpo.Googlesearch("自动化测试开发");
        String result = driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div/div[1]/div/div/h3/a")).getText();
        System.out.println(result);
        Assert.assertTrue(result.contains("自动化测试开发"));

    }
    @AfterMethod
    public void tearDown(){
        //driver.close();
        //driver.quit();
    }
}
