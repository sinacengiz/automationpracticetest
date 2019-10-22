package test.maven;
/*
 * 
 * comment
 *
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestMaven {
	
	public WebDriver driver;
	
	@BeforeClass (groups= {"MyGroup"})
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe.exe");
		 driver = new ChromeDriver();
	}
	@AfterClass (groups= {"MyGroup"})
	public void tearDown() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.close();
	}
@Test (groups= {"MyGroup"})
public void filloutsecond() {
	 driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
	    driver.findElement(By.className("login")).click();
		   driver.findElement(By.id("email_create")).sendKeys("sinacengiz@inbox.com");
		    driver.findElement(By.name("SubmitCreate")).click();}

	@Test (groups= {"MyGroup2"})
	public void fillout() {
		
	
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.findElement(By.id("id_gender1")).click();
		    driver.findElement(By.id("customer_firstname")).sendKeys("sia");
		    driver.findElement(By.id("customer_lastname")).sendKeys("cenz");
		    driver.findElement(By.id("passwd")).sendKeys("devil");
		    driver.findElement(By.id("days")).sendKeys("5");
		    driver.findElement(By.id("months")).sendKeys("January");
		    driver.findElement(By.id("years")).sendKeys("1979");
		    driver.findElement(By.id("newsletter")).click();
		    driver.findElement(By.id("optin")).click();
		    driver.findElement(By.id("company")).sendKeys("esgen yapi denetim");
		    driver.findElement(By.id("address1")).sendKeys("nuri duyguer sk. baris apt");
		    driver.findElement(By.id("address2")).sendKeys("numara 2 daire 1");
		    driver.findElement(By.id("city")).sendKeys("eskisehir");
		    driver.findElement(By.id("id_state")).sendKeys("Alabama");
		    driver.findElement(By.id("postcode")).sendKeys("00000");
		    driver.findElement(By.id("id_country")).sendKeys("United States");
		    driver.findElement(By.id("other")).sendKeys("you have ");
		    driver.findElement(By.id("phone")).sendKeys("+95668943593");
		    driver.findElement(By.id("phone_mobile")).sendKeys("+98486777965");
		    driver.findElement(By.id("alias")).sendKeys("eyup sultan caddesi");
		    driver.findElement(By.id("submitAccount")).click();
		    
		  
		    
}
}
