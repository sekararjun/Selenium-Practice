package automatiom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url="https://www.tutorialspoint.com/selenium/practice/frames.php";
		WebDriver driver=new ChromeDriver();
		driver.get(url);

		driver.switchTo().frame(0);
		driver.findElement(By.className("external-link")).click();
		
		
	}

}
