package automatiom;


	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

	public class ConditionalCheck {
	    public static void main(String[] args) {
	          WebDriver driver = new ChromeDriver();

	      
	        driver.get("https://www.saucedemo.com/");

	      
	        String currentUrl = driver.getCurrentUrl();

	      
	        if (currentUrl.equals("https://www.saucedemo.com/")) {
	            System.out.println(" Successfully navigated to SauceDemo!");
	        } else {
	            System.out.println(" Navigation failed. Current URL: " + currentUrl);
	        }

	       
	        driver.quit();
	    }
	}

