import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StertSelenium {
    WebDriver wd;
    @BeforeMethod
    public void preconditions(){
        wd=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\julia\\Documents\\QA\\QA_Automation\\QA\\Trello_01\\chromedriver.exe");
                wd.navigate().to("https://trello.com/logged-out");
    }

    @Test
    public void testName(){


    }
    @AfterMethod
    public void postconditions(){

    }
}
