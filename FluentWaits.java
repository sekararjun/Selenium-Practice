package automatiom;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaits {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

        driver.findElement(By.id("btn1")).click();

        // FluentWait setup
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))       // Max wait time
                .pollingEvery(Duration.ofSeconds(2))       // Polling interval
                .ignoring(NoSuchElementException.class);   // Ignore element not found

        // Wait until the textbox is visible
        WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));

        text.sendKeys("hi i am");
        
        driver.quit();
    }
}