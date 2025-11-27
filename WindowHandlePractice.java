package automatiom;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url="https://vinothqaacademy.com/multiple-windows/";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		String parent=driver.getWindowHandle();
		driver.findElement(By.id("button1")).click();
		Set<String> allHandles=driver.getWindowHandles();
		for(String child : allHandles) {
			if(!child.equals(parent)) {
				driver.switchTo().window(child);
				System.out.println("child Window : "+child);
				break;
			}
		}

		
	}

}
