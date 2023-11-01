package assignments;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SdetAssignment {

	public static void main(String[] args) throws InterruptedException, MalformedURLException   {
		
		//WebDriver driver = new ChromeDriver();
		/*driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(5000);
		WebElement text=driver.findElement(By.xpath("//h5[contains(@class,'oxd-text')]"));
		text.sendKeys("hey raam");
		System.out.println("this is getText():- "+text.getText());
		System.out.println("this is getAttribute():- "+text.getAttribute("class"));
		*/
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoqa.com/tool-tips");
		WebElement frm1=driver.findElement(By.xpath("//*[@id=\"google_ads_iframe_/21849154601,22343295815/Ad.Plus-728x90_0\"]"));
		driver.switchTo().frame(frm1);
		
		frm1.click();
		
		//WebElement link=driver.findElement(By.xpath("//*[@id=\"toolTipButton\"]"));
		//link.click();
		
		
		
		
		
		
		
		
		
	}

}
