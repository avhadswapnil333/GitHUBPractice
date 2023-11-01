package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment3 {

	public static void main(String[] args) throws InterruptedException {
		//Step 1: Up casting
		WebDriver driver=new ChromeDriver();
		//Step 2; Open a https://demo.automationtesting.in/Register.html
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//step 3: Find the Skills drop down element
		WebElement skills=driver.findElement(By.id("Skills"));
		//Step 4: select the value using Select by Visible Text method
		Select sel1=new Select(skills);
		sel1.selectByVisibleText("MySQL");
		Thread.sleep(3000);
		//step 5: capture /copy the selected value from drop down.
		WebElement capt=sel1.getFirstSelectedOption();
		String p=capt.getText();
		System.out.println(p);
		//step 6: count how many value present in drop down
		Select sel2=new Select(skills);
		List<WebElement>ab=sel2.getOptions();
		int s=ab.size();
		System.out.println(s);
		//step 7: Find the year month drop down element
		WebElement year=driver.findElement(By.id("yearbox"));
		//Step 8: select the value using Select by Visible text method
		Select sel3=new Select(year);
		sel3.selectByVisibleText("1947");
		Thread.sleep(3000);
		//step 9: capture /copy the selected value from drop down.
		WebElement capt1=sel3.getFirstSelectedOption();
		String q=capt1.getText();
		System.out.println(q);
		//step 10: count how many value present in drop down
		Select sel4=new Select(year);
		List<WebElement>cd=sel4.getOptions();
		int t=ab.size();
		System.out.println(t);
		//step 11: find the month drop down element
		WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		//step 12: select the value using select by index method
		Select sel5=new Select(month);
		sel5.selectByIndex(8);
		Thread.sleep(3000);
		//step 13: capture /copy the selected value from drop down.
		WebElement capt2=sel5.getFirstSelectedOption();
		String r=capt2.getText();
		System.out.println(r);
		//step 14: count how many value present in drop down
		Select sel6=new Select(month);
		List<WebElement>ef=sel6.getOptions();
		int u=ef.size();
		//step 15: find the date drop down element
		WebElement day=driver.findElement(By.id("daybox"));
		//step 16: select the value using select by value method
		Select sel7=new Select(day);
		sel7.selectByValue("15");
		Thread.sleep(3000);
		//step 17: capture /copy the selected value from drop down.
		WebElement capt3=sel7.getFirstSelectedOption();
		String x=capt3.getText();
		System.out.println(x);
		//step 18: count how many value present in drop down
		Select sel8=new Select(month);
		List<WebElement>sw=sel8.getOptions();
		int y=sw.size();

	}

}
