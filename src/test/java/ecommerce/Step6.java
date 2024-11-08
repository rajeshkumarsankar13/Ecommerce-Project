package ecommerce;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Step6 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chromedriver = new ChromeDriver();
        chromedriver.get("https://www.bestbuy.com/?intl=nosplash");
        chromedriver.manage().window().maximize();
        chromedriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        chromedriver.findElement(By.id("gh-search-input")).sendKeys("mobiles samsung");
        Thread.sleep(1000);
        chromedriver.findElement(By.xpath("//span[@class='header-search-icon']")).click();
        Thread.sleep(1000);
        chromedriver.findElement(By.xpath("//a[contains(text(),'Samsung - Galaxy S24 Ultra 256GB - Titanium Violet (Verizon)')]")).click();
        Thread.sleep(2000);
        chromedriver.findElement(By.xpath("//button[@class='c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button ']")).click();
        Thread.sleep(2000);
        chromedriver.findElement(By.id("transactions-page__yes")).click();
        chromedriver.findElement(By.xpath("//button[@class='c-button c-button-secondary c-button-lg c-button-block transactions-page__continue-button']")).click();
    }
}
