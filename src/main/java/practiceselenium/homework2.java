package practiceselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework2 {

	public static void main(String[] args) throws InterruptedException {
	//0)UP casting
		WebDriver driver = new ChromeDriver();
	//1) Open a wikipedia application
		driver.get("https://www.wikipedia.org");
	//2) capture URl
		String a=driver.getCurrentUrl();
		System.out.println(a);
		Thread.sleep(5000);	
	//3) navigate to redbus application
		driver.navigate().to("https://www.redbus.in");
	//4) capture url
		String b=driver.getCurrentUrl();
		System.out.println(b);
		Thread.sleep(5000);
		
	//5) navigate to amazon application
		driver.navigate().to("https://www.amazon.in");
	//6) capture URl
		String c=driver.getCurrentUrl();
		System.out.println(c);
		Thread.sleep(5000);
	//7) navigate back driver
		driver.navigate().back();
		
	//8) capture title
		String d=driver.getTitle();
		System.out.println(d);
		Thread.sleep(5000);
	//9) navigate back
		driver.navigate().back();
	//10) capture title
		String e=driver.getTitle();
		System.out.println(e);
		Thread.sleep(5000);
	//11) navigate forward
		driver.navigate().forward();
	//12) capture title
		String f=driver.getCurrentUrl();
		System.out.println(f);
	//13) refresh the web page
		driver.navigate().refresh();

	}

}
