package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class registerform {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement firstname=driver.findElement(By.name("firstName"));
		if (firstname.isDisplayed() && firstname.isEnabled());
		{
			firstname.sendKeys("swapnil");
			System.out.println("Test case of firstname is Pass");
		}
		Thread.sleep(3000);
		
		WebElement lastname=driver.findElement(By.name("lastName"));
		if (lastname.isDisplayed() && lastname.isEnabled())
		{
			lastname.sendKeys("avhad");
			System.out.println("Test case of lastname is Pass");
		}
		Thread.sleep(3000);
		
		WebElement phone=driver.findElement(By.name("phone"));
		if (phone.isDisplayed() && phone.isEnabled())
		{
			phone.sendKeys("8329412685");
			System.out.println("Test case of phone is Pass");
		}
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.name("userName"));
			if(email.isDisplayed() && email.isEnabled())
				{
				email.sendKeys("swapnil@gmail.com");
				System.out.println("Test case of email is Pass");
				}
			Thread.sleep(3000);
		
		WebElement address = driver.findElement(By.name("address1"));
		if(address.isDisplayed()&& address.isEnabled())
		{
			address.sendKeys("Pune");
			System.out.println("Test case of address is Pass");
		}
		Thread.sleep(3000);
		
		WebElement city=driver.findElement(By.name("city"));
		if(city.isDisplayed()&& city.isEnabled())
		{
			city.sendKeys("Pune");
			System.out.println("Test case of city is Pass");
		}
		Thread.sleep(3000);
		
		WebElement state=driver.findElement(By.name("state"));
		if(state.isDisplayed()&& state.isEnabled())
		{
			state.sendKeys("Maharashtra");
			System.out.println("Test case of state is Pass");
		}
		Thread.sleep(3000);
		
		WebElement postalcode=driver.findElement(By.name("postalCode"));
		if(postalcode.isDisplayed()&& postalcode.isEnabled())
		{
			postalcode.sendKeys("411017");
			System.out.println("Test case of postalcode is Pass");
		}
		Thread.sleep(3000);
		
		WebElement username=driver.findElement(By.name("email"));
		if(username.isDisplayed()&& username.isEnabled())
		{
			username.sendKeys("swapnil333");
			System.out.println("Test case of username is Pass");
		}
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.name("password"));
		if(password.isDisplayed()&& password.isEnabled())
		{
			password.sendKeys("swapnil#333");
			System.out.println("Test case of password is Pass");
		}
		Thread.sleep(3000);
		
		WebElement confpass=driver.findElement(By.name("confirmPassword"));
		if(confpass.isDisplayed()&& confpass.isEnabled())
		{
			confpass.sendKeys("swapnil#333");
			System.out.println("Test case of confirmPassword is Pass");
		}
		Thread.sleep(3000);
		
		WebElement submit=driver.findElement(By.name("submit"));
		if(submit.isDisplayed()&& submit.isEnabled())
		{
			submit.click();
			System.out.println("Test case of submit is Pass");
		}
				
	}

}
