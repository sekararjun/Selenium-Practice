package automatiom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait_im {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("txt1")).sendKeys("hi i am");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("txt2")).sendKeys("hi i am sekar");
		
	}

}
