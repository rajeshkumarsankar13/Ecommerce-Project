package ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Step9 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chromedriver = new ChromeDriver();
        chromedriver.navigate().to("https://www.bestbuy.com/?intl=nosplash");
        chromedriver.manage().window().maximize();
        chromedriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        chromedriver.findElement(By.xpath("//span[@class='v-p-right-xxs line-clamp']")).click();
        chromedriver.findElement(By.xpath("//a[text()='Payment Methods']")).click();
        chromedriver.findElement(By.name("fld-e")).sendKeys("testuser@test.com");
        chromedriver.findElement(By.name("fld-p1")).sendKeys("@Abcd1234");
        chromedriver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
