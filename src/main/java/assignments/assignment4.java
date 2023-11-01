package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class assignment4 {

	public static void main(String[] args) throws InterruptedException {
		//Step 1: Up casting
		WebDriver driver=new ChromeDriver();
		//Step 2; Open a https://demoqa.com/automation-practice-form URL
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		//step 3: check displayed status, enabled status , enter fname,
		WebElement firstname=driver.findElement(By.id("firstName"));
		if(firstname.isDisplayed()&& firstname.isEnabled())
		{
			firstname.sendKeys("Swapnil");
			System.out.println("Test case of firstname textbox is Pass");
		}
		Thread.sleep(3000);
		//step 4: check displayed status, enabled status enter lastname,
		WebElement lastname=driver.findElement(By.id("lastName"));
		if(lastname.isDisplayed()&& lastname.isEnabled())
		{
			lastname.sendKeys("Avhad");
			System.out.println("Test case of lastname textbox is Pass");
		}
		Thread.sleep(3000);
		//step 5: check displayed status, enabled status enter email, 
		WebElement email=driver.findElement(By.id("userEmail"));
		if(email.isDisplayed()&& email.isEnabled())
		{
			email.sendKeys("swapnil@gmail.com");
			System.out.println("Test case of email textbox is Pass");
		}
		Thread.sleep(3000);
		//step 6: check displayed status, enabled status ,selected status and select gender,
		WebElement wb=driver.findElement(By.id("gender-radio-1"));
		Actions act=new Actions(driver);
		act.click(wb).build().perform();
		//step 7: check displayed status, enabled status enter mobile no
		WebElement mobNo=driver.findElement(By.id("userNumber"));
		if(mobNo.isDisplayed()&& mobNo.isEnabled())
		{
			mobNo.sendKeys("8329412685");
			System.out.println("Test case of mobile number textbox is Pass");
		}
		Thread.sleep(3000);
		//step 8: click on date of birth Object
		WebElement dob=driver.findElement(By.id("dateOfBirthInput"));
		dob.click();
		/*step 9:Select Month using selectByIndex() method
				drop down xpath :  	//select[@class='react-datepicker__month-select'] */
		WebElement month=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
			//i) select any month	
		Select sel1=new Select(month);
		sel1.selectByVisibleText("March");
		Thread.sleep(3000);
			//ii) captured selected month
		WebElement capt1=sel1.getFirstSelectedOption();
		String a=capt1.getText();
		System.out.println(a);
			//iii) count how many value present
		Select sel2=new Select(month);
		List<WebElement>ls=sel2.getOptions();
		int b=ls.size();
		Thread.sleep(3000);
		
		/*step 10: select year using selectByVisibleText() method
				year drop down xpath://select[@class='react-datepicker__year-select'] */
		WebElement year=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
			//i) select anyone year 
		Select sel3=new Select(year);
		sel3.selectByVisibleText("1994");
		Thread.sleep(3000);
			//ii) captured selected month
		WebElement capt2=sel3.getFirstSelectedOption();
		String c=capt2.getText();
		System.out.println(c);
			//iii) count how many value present */
		Select sel4=new Select(month);
		List<WebElement>ls1=sel4.getOptions();
		int d=ls1.size();

		/*step 11:select anyone date:			
			select date xpath : 	(//div[text()='15'])[1] */
		WebElement date=driver.findElement(By.xpath("(//div[text()='23'])[1]"));
		date.click();
	
		WebElement subjects =driver.findElement(By.id("subjectsInput"));
		subjects.sendKeys("Automation Testing");
		Thread.sleep(3000);
		WebElement checkbox1 = driver.findElement(By.xpath("//label[text()='Reading']"));
		checkbox1.click();
		WebElement checkbox2 = driver.findElement(By.xpath("//label[text()='Sports']"));
		checkbox2.click();
		WebElement checkbox3 = driver.findElement(By.xpath("//label[text()='Music']"));
		checkbox3.click();	
	}

}
