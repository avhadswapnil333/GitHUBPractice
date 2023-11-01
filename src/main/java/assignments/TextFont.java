package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFont {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/");
		WebElement img = driver.findElement(By.xpath("//img[@alt='MacBook']"));
		//System.out.println(img.getCssValue("box-sizing"));
		
		int height = img.getRect().getDimension().getHeight();
		int width=img.getRect().getDimension().getWidth();
		
		System.out.println("height of image= "+height);
		System.out.println("width of image= "+width);
		
		
	}

}
