package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement element = driver.findElement(By.xpath("//h2[text()='Alerts & Popups']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        String parentWIndow = driver.getWindowHandle();
        driver.findElement(By.xpath("//button[text()='New Tab']")).click();
        Set<String> windowHandle = driver.getWindowHandles();
       /* for (String windowHandles:windowHandle) {

            if(!windowHandles.equals(parentWIndow)) {

                driver.switchTo().window(windowHandles);
            }
        }*/
        List<String> handlesList = new ArrayList<>(driver.getWindowHandles());
// driver.switchTo().window(handlesList.get(0)); // original
        driver.switchTo().window(handlesList.get(1));
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='widget-content']/ul/li[4]/a[contains(@href,'istqb-certification')]")).getText();






    }
}
