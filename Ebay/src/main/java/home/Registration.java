package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.testng.annotations.Test;

public class Registration extends CommonAPI {

    @Test (enabled = false)
    public void registration ()throws InterruptedException{

        driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Rocky");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Topna");
        driver.findElement(By.cssSelector("#email")).sendKeys("rockytopna@gmail.com");
        driver.findElement(By.cssSelector("#PASSWORD")).sendKeys("1234");
        clickOnElement("#ppaFormSbtBtn");
        Thread.sleep(1000);
    }

}
