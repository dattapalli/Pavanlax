package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//th[@aria-label='Veg/fruit name: activate to sort column ascending']")).click();
        List <WebElement> sr=driver.findElements(By.xpath("//tbody/tr/td[1]"));
        List<String> originalele =sr.stream().map(WebElement::getText).collect(Collectors.toList());
        List<String> sortetedlist =originalele.stream().sorted().collect(Collectors.toList());
        Assert.assertEquals(originalele,sortetedlist);
        System.out.println(originalele);
        System.out.println(sortetedlist);
    }
}
