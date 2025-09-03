package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleIdprogram {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/");
        driver.manage().window().maximize();
        boolean LogDisplyaed =driver.findElement(By.xpath("//div[contains(@class,'hidden-xs')]/a[text()='Get Started']")).isDisplayed();
        System.out.println(LogDisplyaed);
    }







}



