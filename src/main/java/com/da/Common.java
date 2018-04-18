package com.da;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;



public class Common {
    public static void shotscreen(WebDriver driver, String filename){

        try{
            File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenShotFile, new File("log/screenshot/" + filename + ".png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
