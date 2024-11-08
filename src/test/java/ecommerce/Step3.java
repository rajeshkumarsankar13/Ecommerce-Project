package ecommerce;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Step3 extends BaseClass {

    @Test
    public void signin() {
        chromedriver.navigate().to("https://www.bestbuy.com/identity/signin?token=tid%3A4b12e58a-9ce8-11ef-b485-065e0b45defb");
        chromedriver.navigate().refresh();
        chromedriver.findElement(By.name("fld-e")).sendKeys("testuser@test.com");
        chromedriver.findElement(By.name("fld-p1")).sendKeys("@Abcd1234");
        chromedriver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Test
    public void login(){
        chromedriver.navigate().to("https://www.bestbuy.com/identity/newAccount?token=tid%3A9116e486-9cf2-11ef-9009-022404c8e769");
        chromedriver.findElement(By.name("firstName")).sendKeys("Rajeshkumar");
        chromedriver.findElement(By.name("lastName")).sendKeys("Sankar");
        chromedriver.findElement(By.id("email")).sendKeys("testuser123@test.com");
        chromedriver.findElement(By.name("fld-p1")).sendKeys("@Abcd1234");
        chromedriver.findElement(By.id("reenterPassword")).sendKeys("@Abcd1234");
        chromedriver.findElement(By.name("phone")).sendKeys("67834868636");
        chromedriver.findElement(By.xpath("//button[contains(text(),'Create an Account')]")).click();
    }
}
