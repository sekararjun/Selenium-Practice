package automatiom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MutiSelect {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url="https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		WebElement dropdown=driver.findElement(By.id("ide"));
		Select select=new Select(dropdown);
		select.selectByIndex(2);
		Thread.sleep(1000);
		select.selectByValue("ec");
		Thread.sleep(1000);
		select.selectByVisibleText("NetBeans");
		select.deselectAll();		
				

	}

}
