package homework1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	WebDriver driver;
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepi\\Selenium_workspace\\homework1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		
	}
	@Test
	public void TestCase() throws InterruptedException {
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Bank & Cash")).click();
		driver.findElement(By.linkText("New Account")).click();
		driver.findElement(By.id("account")).sendKeys("Checkin");
		driver.findElement(By.id("description")).sendKeys("Business Account");
		driver.findElement(By.id("balance")).sendKeys("1200000");
		driver.findElement(By.id("account_number")).sendKeys("124582563");
		driver.findElement(By.id("contact_person")).sendKeys("Deepika AmmuArun");
		driver.findElement(By.id("contact_phone")).sendKeys("8585284706");
		driver.findElement(By.id("ib_url")).sendKeys("www.google.com");
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")).click();
		Thread.sleep(2000);
		
	}
	@After
	public void teardown() {
		
		driver.close();
	
	}
	
}
