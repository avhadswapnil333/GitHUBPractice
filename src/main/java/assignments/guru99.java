package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement firstname=driver.findElement(By.name("firstName"));
		boolean a=firstname.isDisplayed();
		System.out.println(a);
		boolean b=firstname.isEnabled();
		System.out.println(b);
		firstname.sendKeys("Swapnil");
		Thread.sleep(3000);
		WebElement lastname=driver.findElement(By.name("lastName"));
		boolean c=lastname.isDisplayed();
		System.out.println(c);
		boolean d=lastname.isEnabled();
		System.out.println(d);
		lastname.sendKeys("Avhad");
		Thread.sleep(3000);
		WebElement phone=driver.findElement(By.name("phone"));
		boolean e=phone.isDisplayed();
		System.out.println(e);
		boolean f=phone.isEnabled();
		System.out.println(f);
		phone.sendKeys("8329412685");
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.name("userName"));;
		boolean g=email.isDisplayed();
		System.out.println(g);
		boolean h=email.isEnabled();
		System.out.println(h);
		email.sendKeys("swapnil@gamil.com");
		Thread.sleep(3000);
		WebElement address=driver.findElement(By.name("address1"));
		boolean i=address.isDisplayed();
		System.out.println(i);
		boolean j=address.isEnabled();
		System.out.println(g);
		address.sendKeys("Pune");
		Thread.sleep(3000);	
		WebElement city=driver.findElement(By.name("city"));
		boolean k=city.isDisplayed();
		System.out.println(k);
		boolean l=city.isEnabled();
		System.out.println(l);
		city.sendKeys("Pune");
		Thread.sleep(3000);	
		WebElement state=driver.findElement(By.name("state"));
		boolean m=state.isDisplayed();
		System.out.println(m);
		boolean n=state.isEnabled();
		System.out.println(n);
		state.sendKeys("Maharastra");
		Thread.sleep(3000);	
		WebElement postal=driver.findElement(By.name("postalCode"));
		boolean o=postal.isDisplayed();
		System.out.println(o);
		boolean p=postal.isEnabled();
		System.out.println(p);
		postal.sendKeys("411017");
		Thread.sleep(3000);	
		WebElement username=driver.findElement(By.name("email"));
		boolean q=username.isDisplayed();
		System.out.println(q);
		boolean r=username.isEnabled();
		System.out.println(r);
		username.sendKeys("swapnil333");
		Thread.sleep(3000);	
		WebElement password=driver.findElement(By.name("password"));
		boolean s=password.isDisplayed();
		System.out.println(q);
		boolean t=password.isEnabled();
		System.out.println(r);
		password.sendKeys("password@123");
		Thread.sleep(3000);
		WebElement confpass=driver.findElement(By.name("confirmPassword"));
		boolean u=confpass.isDisplayed();
		System.out.println(u);
		boolean v=confpass.isEnabled();
		System.out.println(v);
		confpass.sendKeys("password@123");
		Thread.sleep(3000);
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		boolean w=submit.isDisplayed();
		System.out.println(w);
		boolean x=submit.isEnabled();
		System.out.println(x);
		submit.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
