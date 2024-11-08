package ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Step4 extends BaseClass{

    @Test
    public void navigate() throws InterruptedException {
        Actions action = new Actions(chromedriver);
        chromedriver.navigate().to("https://www.bestbuy.com/?intl=nosplash");
        chromedriver.navigate().refresh();
        WebElement menu = chromedriver.findElement(By.xpath("//button[@class='c-button-unstyled hamburger-menu-button']"));
        action.moveToElement(menu).perform();
        WebElement tv = chromedriver.findElement(By.xpath("//button[text()='TV & Home Theater']"));
        action.moveToElement(tv).build().perform();
        Thread.sleep(2000);
        chromedriver.navigate().back();
        Thread.sleep(2000);
        chromedriver.navigate().back();
        Thread.sleep(2000);
        chromedriver.navigate().forward();
        Thread.sleep(2000);
        chromedriver.navigate().forward();
        Thread.sleep(2000);
        chromedriver.navigate().refresh();
        chromedriver.close();
    }
}
