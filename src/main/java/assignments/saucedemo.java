package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html");
		WebElement username=driver.findElement(By.name("user-name"));
		boolean a=username.isDisplayed();
		System.out.println(a);
		boolean b=username.isEnabled();
		System.out.println(b);
		username.sendKeys("standard_user");
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.name("password"));
		boolean c=password.isDisplayed();
		System.out.println(c);
		boolean d=password.isEnabled();
		System.out.println(d);
		password.sendKeys("secret_sauce");
		Thread.sleep(3000);
		
		
		WebElement login=driver.findElement(By.name("login-button"));
		boolean e=login.isDisplayed();
		System.out.println(e);
		boolean f=login.isEnabled();
		System.out.println(f);
		login.click();
		Thread.sleep(3000);
		
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(3000);
		
		WebElement addcart1=driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
		addcart1.click();
		Thread.sleep(3000);
		
		WebElement addcart2=driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt"));
		addcart2.click();
		Thread.sleep(3000);
		
		WebElement addcart3=driver.findElement(By.name("add-to-cart-test.allthethings()-t-shirt-(red)"));
		addcart3.click();
		Thread.sleep(3000);
		
		 WebElement link = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		 link.click();
		 Thread.sleep(3000);
		 
		 WebElement checkout = driver.findElement(By.name("checkout"));
		 checkout.click();
		 Thread.sleep(3000);
		 
		 WebElement firstname = driver.findElement(By.name("firstName"));
		 boolean g=firstname.isDisplayed();
		 System.out.println(g);
		 boolean h=firstname.isEnabled();
		 System.out.println(h);
		 firstname.sendKeys("swapnil");
		 Thread.sleep(3000);
		 
		 WebElement lastname = driver.findElement(By.name("lastName"));
		 boolean i=lastname.isDisplayed();
		 System.out.println(i);
		 boolean j=lastname.isEnabled();
		 System.out.println(j);
		 lastname.sendKeys("avhad");
		 Thread.sleep(3000);
		 
		 WebElement postcode = driver.findElement(By.name("postalCode"));
		 boolean k=postcode.isDisplayed();
		 System.out.println(k);
		 boolean l=postcode.isEnabled();
		 System.out.println(l);
		 postcode.sendKeys("411017");
		 Thread.sleep(3000);
		 
		 WebElement cont = driver.findElement(By.name("continue"));
		 cont.click();
		 Thread.sleep(3000);
		 
		 WebElement finish = driver.findElement(By.name("finish"));
		 finish.click();
		 Thread.sleep(3000);
		 
		 WebElement back = driver.findElement(By.name("back-to-products"));
		 back.click();
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		

	}

}
