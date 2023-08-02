package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Baseclass {
	
	public static WebDriver driver;
	
	public static void intitialization() {
		
	 driver=new EdgeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
	 
	 driver.manage().deleteAllCookies();
	 
	 driver.get("https://demo.guru99.com/test/newtours/register.php");
	
	}

}
