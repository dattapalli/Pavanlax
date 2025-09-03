package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Orangehrmsizeoflinks {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement ele1 = driver.findElement(By.xpath("//input[@name='username']"));
        ele1.sendKeys("Admin");
        WebElement ele2 = driver.findElement(By.xpath("//input[@name='password']"));
        ele2.sendKeys("admin123");
        WebElement ele3 = driver.findElement(By.xpath("//button[text()=' Login ']"));
        ele3.click();
       // In DOM total links count
        /*List<WebElement> ele4= driver.findElements(By.tagName("a"));
        System.out.println(ele4.size());*/
        WebElement ele5 = driver.findElement(By.xpath("//span[text()='Admin']"));
        ele5.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement elo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Organization ']")));
        elo.click();
        List<WebElement> ele6 = driver.findElements(By.xpath("//ul[@class='oxd-dropdown-menu']/li"));
        System.out.println(ele6.size());

        //  WebElement ele6=driver.findElement(By.xpath("//span[text()='Admin']"))
        // ele6.click();


    }
}
