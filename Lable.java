package automatiom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Lable {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
        
        List<WebElement> labels = driver.findElements(By.tagName("label"));
        
        for (WebElement label : labels) {
            System.out.println("Label Text: " + label.getText());
        }
        
        driver.quit();
    }
}