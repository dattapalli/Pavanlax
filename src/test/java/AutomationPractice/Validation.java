package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.opencart.com/");
        driver.manage().window().maximize();
        //validation for getTitle method is using
       /* String act_title= driver.getTitle();
        System.out.println(act_title);*/
        String Tit = driver.findElement(By.xpath("(//a[@href=\"https://www.opencart.com/blog\"])[1]")).getText();
        System.out.println(Tit);
        if(Tit.equalsIgnoreCase("Blog"))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test Failed");
        }
    }
}
