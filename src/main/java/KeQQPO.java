import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeQQPO {
    public WebDriver driver;
    public static By searchInput = By.id("js_keyword");
    public static By searchButton = By.id("js_search");
    public static String url = "https://ke.qq.com";
    public KeQQPO(WebDriver driver){
        this.driver = driver;
        driver.get(url);
    }

    public void keSearch(String keywords){
        driver.findElement(searchInput).sendKeys(keywords);
        driver.findElement(searchButton).click();
    }
}
