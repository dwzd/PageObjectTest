import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaiduSearchPO extends BasicPO{
    //public WebDriver driver;
    public static By BaiduSearchInput = By.id("kw");
    public static By BaiduSearchButton = By.id("su");
    //构造函数定义浏览器，并启动它，及加载页面

    public BaiduSearchPO(WebDriver driver){
        this.driver = driver;
        url = "https://www.baidu.com";
        driver.get(url);
   }
   //定义一个方法，把搜索和按钮都封装起来
    public  void BaiduSearch(String keywords){
        driver.findElement(BaiduSearchInput).sendKeys(keywords);
        driver.findElement(BaiduSearchButton).click();
    }
}
