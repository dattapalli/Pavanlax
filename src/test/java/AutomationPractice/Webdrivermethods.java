package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Webdrivermethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login ");
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle());
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Set<String>window=driver.getWindowHandles();
        System.out.println(window);




    }
}
