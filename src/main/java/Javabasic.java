import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javabasic {
    public static void main(String[] args) {
//        int i;
//        i = 10;
//        System.out.println("PageObject" + i);
//        String os = (System.getProperty("os.name"));
//        if (os.equalsIgnoreCase("Mac OS X"))
//            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
//        else System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        BaiduSearchPO bspo = new BaiduSearchPO(driver);
 //       driver.get("https://www.google.ca");
//        driver.findElement(By.id("kw")).sendKeys("Selenium Page object");
//        driver.findElement(By.id("su")).click();
        //特殊的操作
        driver.findElement(BaiduSearchPO.BaiduSearchInput).sendKeys("学习");
        //driver.findElement(BaiduSearchPO.BaiduSearchButton).click();
        bspo.Googlesearch("selenium page object");

        KeQQPO kqpo = new KeQQPO(driver);
        kqpo.keSearch("java");
    }
}
