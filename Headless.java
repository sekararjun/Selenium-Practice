package automatiom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Headless {
    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless");   // Run without UI
        options.addArguments("--disable-gpu"); // Recommended for stability

        WebDriver driver = new EdgeDriver(options);

        driver.get("https://www.saucedemo.com/");

        System.out.println("Page Title: " + driver.getTitle());

        driver.quit();
    }
}