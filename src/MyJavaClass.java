import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;



public class MyJavaClass {
	
	WebDriver driver = new ChromeDriver();

	
	@BeforeTest

	public void myBeforeTest() {
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void myTest ()
	
	{
		
		
	}
	

}
