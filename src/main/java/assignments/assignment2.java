package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://prafulp1030.github.io/RegisterForm.html");
		
		WebElement firstname=driver.findElement(By.id("fname"));
		if(firstname.isDisplayed()&&firstname.isEnabled()) 
		{
			firstname.sendKeys("Swapnil");
			System.out.println("Test case of firstname TextBox is pass");
		}
		Thread.sleep(3000);
		WebElement lastname = driver.findElement(By.id("lname"));
        if(lastname.isDisplayed()&& lastname.isEnabled()) 
        {
       	 lastname.sendKeys("Avhad");
       	 System.out.println("Test case of lastname TextBox pass");
        }
        Thread.sleep(3000);
        
        WebElement address = driver.findElement(By.id("address"));
        if(address.isDisplayed()&&address.isEnabled()) 
        {
       	 address.sendKeys("Pune");
       	 System.out.println("Test case of address TextBox pass");
        }
        Thread.sleep(3000);
        
        WebElement mobNo = driver.findElement(By.id("mobileNo"));
        if(mobNo.isDisplayed() && mobNo.isEnabled()) 
        {
       	 mobNo.sendKeys("8329412685");
       	 System.out.println("Test case of mobNo TextBox pass");
        }
        Thread.sleep(3000);
        
        WebElement email = driver.findElement(By.id("emaildId"));
        if(email.isDisplayed() && email.isEnabled()) 
        {
       	 email.sendKeys("swapnil@gmail.com");
       	 System.out.println("Test case of email TextBox is pass");
        }
        Thread.sleep(3000);
        
        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
        if(submit.isDisplayed() && submit.isEnabled()) 
        {
       	 submit.click();
       	 System.out.println("Test case of submit button is pass");
       	 
        }
	}

}
