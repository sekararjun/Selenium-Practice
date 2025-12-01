package automatiom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WAit_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		WebDriverWait waits=new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(By.id("btn1")).click();
	//	WebElement text=driver.findElement(By.id("txt1"));
		WebElement txt1=waits.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));
		txt1.sendKeys("hi i am");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		//driver.findElement(By.id("btn2")).click();
		//driver.findElement(By.id("txt2")).sendKeys("hi i am sekar");
		
	}

}
