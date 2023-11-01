package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoAndHeadless {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		
		
		//opt.addArguments("--headless");
		
		
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println("headless is done......");
		
		

	}

}
