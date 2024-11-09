import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases {
	//Esraa
	
	WebDriver driver = new ChromeDriver();
	
	
	@BeforeTest
	public void setup()
	{
	driver.get("https://www.google.com");	
		
	}
	
	
	
	@Test
	public void searchAboutEsraa ()
	{
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Esraa Alkhdour"+Keys.ENTER);
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/span/a/h3")).click();
	}
	
	
	
	@AfterTest 
	public void afterTest()
	{
		
	}

}
