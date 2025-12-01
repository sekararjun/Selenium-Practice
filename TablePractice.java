package automatiom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		WebElement table=driver.findElement(By.id("countries"));
        List<WebElement> rows=table.findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            List<WebElement> cols=row.findElements(By.tagName("td"));
            for(WebElement col: cols) {
            	System.out.println(col.getText()+" ");
            }
        	System.out.println();

        }
        
	
	}

}
