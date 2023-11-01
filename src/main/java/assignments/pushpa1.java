package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pushpa1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		WebElement googlebox=driver.findElement(By.name("q"));
		googlebox.sendKeys("Pushpa: The Rise");
		
		
		

	}

}
