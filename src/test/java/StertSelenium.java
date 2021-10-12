import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.PseudoColumnUsage;
import java.util.List;

public class StertSelenium {
    WebDriver wd;
    @BeforeMethod
    public void preconditions(){
        wd=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\julia\\Documents\\QA\\QA_Automation\\QA\\Trello_01\\chromedriver.exe");
                wd.navigate().to("https://trello.com/");

    }

    @Test
    public void testName(){
        WebElement a = wd.findElement(By.tagName("a"));
        List<WebElement> a1 = wd.findElements(By.tagName("a"));
        System.out.println(a1.size());


    }
    @AfterMethod
    public void postconditions(){

    }
}
