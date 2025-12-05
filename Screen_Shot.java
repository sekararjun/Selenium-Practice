
package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Shot {

    public static void main(String[] args) throws IOException {
        
        
        String loginPath = "N:\\eclipse\\screenshot\\ScreenShot\\login_page.png";
        String productsPath = "N:\\eclipse\\screenshot\\ScreenShot\\products_page.png";

        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcLogin = ts.getScreenshotAs(OutputType.FILE);
        File destLogin = new File(loginPath);
        FileUtils.copyFile(srcLogin, destLogin);
        System.out.println("Login page screenshot saved at: " + loginPath);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        File srcProducts = ts.getScreenshotAs(OutputType.FILE);
        File destProducts = new File(productsPath);
        FileUtils.copyFile(srcProducts, destProducts);
        System.out.println("Products page screenshot saved at: " + productsPath);

        driver.quit();
    }
}