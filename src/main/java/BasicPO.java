import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasicPO {
    public WebDriver driver;
    public static String url;
    public static long globaltimeout = 5; //设置一个全局等待时间
    public static Logger logger = LogManager.getLogger();

    public WebElement findelement(By by){
        WebElement element;
        try {
            element = new WebDriverWait(driver, globaltimeout).until(ExpectedConditions.presenceOfElementLocated(by));
            logger.info(this.getClass().getName() + by.toString() + " -The object was accessed!");
            return element;
        }
        catch (Exception e){
            //System.out.println(by.toString()+"This object could not be found!");
            logger.error( this.getClass().getName() + by.toString() + " This object could not be found!!!");
            return null;
        }
    }
    //PO中如何封装，对象查找，显示时间等待，错误截图，操作步骤日志
    public WebElement findelement(By by, long timeout){
        WebElement element;
        try{
            element = new WebDriverWait(driver, timeout).until(ExpectedConditions.presenceOfElementLocated(by));
            logger.info(this.getClass().getName() + by.toString() + " This object was accessed!!");
            return element;
        }catch (Exception e){
            logger.error(this.getClass().getName() + by.toString() + " The object could not be found!!");
            return null;
        }
    }
}
