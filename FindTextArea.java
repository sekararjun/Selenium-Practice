package automatiom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTextArea {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver browser=new ChromeDriver();
		
		browser.get("https://www.google.com");
		WebElement textarea=browser.findElement(By.id("APjFqb"));
		textarea.sendKeys("cricbuzz");
		browser.quit();
	}
}
