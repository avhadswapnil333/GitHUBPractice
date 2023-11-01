package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm {

	public static void main(String[] args) throws InterruptedException {
		//Step 1: Up casting
		WebDriver driver=new ChromeDriver();
		//Step 2: Open a URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		//Step 3: find the username text box
		WebElement username=driver.findElement(By.name("username"));
		//step 4: check username text box displayed status
		boolean a=username.isDisplayed();
		System.out.println(a);
		//step 5: check username text box enabled status
		boolean b=username.isEnabled();
		System.out.println(b);
		//step 6: enter the Admin username 
		username.sendKeys("Admin");
		Thread.sleep(5000);
		//Step 7: find the password text box
		WebElement password=driver.findElement(By.name("password"));
		//step 8: check password text box displayed status
		boolean c=password.isDisplayed();
		System.out.println(c);
		//step 9: check password text box enabled status
		boolean d=password.isEnabled();
		System.out.println(d);
		//step 10: enter the admin123 password
		password.sendKeys("admin123");
		Thread.sleep(5000);
		 //Step 11: find the login button 		
		WebElement login = driver.findElement(By.xpath("//button[text()=' Login ']"));
		
		//step 12: check login button displayed
		boolean e=login.isDisplayed();
		System.out.println(e);
		//step 13: check login button enabled status
		boolean f=login.isEnabled();
		System.out.println(f);
		//step 14": click on login button
		login.click();
		//step 15: capture home page title
		String title= driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		//step 16: capture home page url
		String url=driver.getCurrentUrl();
		System.out.println(url);
		

	}

}
