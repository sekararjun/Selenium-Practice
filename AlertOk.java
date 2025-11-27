package automatiom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertOk {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        String url="https://www.hyrtutorials.com/p/alertsdemo.html";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("promptBox")).click();;
		Alert al=driver.switchTo().alert();
		Thread.sleep(2000);
	//	al.accept();//to click OK in alert box
	//	al.dismiss();//to click CANCEL in alert box
		al.sendKeys("sekar the boss");// to type CONFIRM in alert box
	    al.accept();
	}

}
