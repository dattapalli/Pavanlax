package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//Is Displayed
//Is Enabled
//Selected


public class webelementconditions {
    public static void main(String[] args) {
        //inteface variable=keyword class
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.nopcommerce.com/en/get-started");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement logo =driver.findElement(By.xpath("//img[@title='nopCommerce']"));
        System.out.println(logo.isDisplayed());


    }
}
