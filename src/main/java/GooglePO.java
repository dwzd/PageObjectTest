import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePO extends BasicPO{
    public static By GoogleSearchInput = By.id("lst-ib");
    public static By GoogleSearchButton = By.xpath("//input[@value='Google Search']");

    public GooglePO(WebDriver driver){
        this.driver = driver;
        url = "https://www.google.ca";
        driver.get(url);
    }
    //定义一个方法，把搜索和按钮都封装起来
    public  void Googlesearch(String keywords){
//        driver.findElement(GoogleSearchInput).sendKeys(keywords);
//        Thread.sleep(2000);
//        driver.findElement(GoogleSearchButton).click();
        this.findelement(GoogleSearchInput, 10).sendKeys(keywords);
        this.findelement(GoogleSearchButton,10).click();
    }
}
