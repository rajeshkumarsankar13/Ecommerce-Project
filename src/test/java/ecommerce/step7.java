package ecommerce;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class step7{
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chromedriver = new ChromeDriver();
        chromedriver.navigate().to("https://www.bestbuy.com/?intl=nosplash");
        chromedriver.manage().window().maximize();
        chromedriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        chromedriver.findElement(By.xpath("//button[@class='c-button-unstyled hamburger-menu-button']")).click();
        Thread.sleep(2000);
        chromedriver.findElement(By.xpath("//button[text()='TV & Home Theater']")).click();
        Thread.sleep(2000);
        chromedriver.findElement(By.xpath("//button[text()='TVs by Brand']")).click();
        Thread.sleep(2000);
        chromedriver.findElement(By.xpath("//a[text()='Samsung TVs']")).click();
        Thread.sleep(2000);
    }

    }

