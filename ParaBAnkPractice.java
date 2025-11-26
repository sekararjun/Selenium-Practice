package automatiom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBAnkPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver=new ChromeDriver();
         driver.get("https://parabank.parasoft.com/parabank/index.htm");
         WebElement username=driver.findElement(By.name("username"));
         username.sendKeys("Sekar");
         
         WebElement password=driver.findElement(By.name("password"));
         password.sendKeys("password");
         
         WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log In']"));
         loginBtn.click();
         driver.close();
	}

}
