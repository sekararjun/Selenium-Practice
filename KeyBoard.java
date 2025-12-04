package automatiom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import java.time.Duration;

public class KeyBoard {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com/");

        Actions act = new Actions(driver);

        act.sendKeys(Keys.TAB)                     
           .sendKeys("standard_user")
           .sendKeys(Keys.TAB)                     
           .sendKeys("secret_sauce")
           .sendKeys(Keys.TAB)                     
           .sendKeys(Keys.ENTER)                   
           .build()
           .perform();
    }
}
