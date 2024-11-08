package ecommerce;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    ChromeDriver chromedriver;
    FirefoxDriver firefoxdriver;


    @BeforeTest
    public void setUp(){
        chromedriver = new ChromeDriver();
        //firefoxdriver = new FirefoxDriver();
        chromedriver.manage().window().maximize();
        chromedriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

//    @AfterTest
//    public void tearDown(){
//        chromedriver.quit();
//    }
}
