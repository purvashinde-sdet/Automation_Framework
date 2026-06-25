package GitPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void loginTest() throws InterruptedException {
		// updated test case


	WebDriver driver = new EdgeDriver();


	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	
	Thread.sleep(3000);
	driver.quit();


	}



}
