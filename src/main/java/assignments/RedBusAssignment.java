package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusAssignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Aurangabad");
		
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Jalna");
		
		driver.findElement(By.xpath("//div[@id='onwardCal']")).click();
		
		String month_year="Feb 2025";
		String date="13";
		//logic for selecting month_year
		
		while(true)
		{
		String Act_monthYear=driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][2]")).getText();
		System.out.println(Act_monthYear);
		if(Act_monthYear.equals(month_year))
		{
			break;
		}
		
			driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][3]")).click();
		}
			
		//logic for selecting date
		
		List<WebElement> allDates=driver.findElements(By.xpath("//div[@class='DatePicker__MainBlock-sc-1kf43k8-1 hHKFiR']//div[@class='DayTiles__CalendarDaysBlock-sc-1xum02u-0 isgDNj']"));
		
		/*for(WebElement dt:allDates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}	
		}*/
		
		for(int i=0;i<allDates.size();i++)
		{
			if(allDates.get(i).getText().equals(date))
			{
				allDates.get(i).click();
				break;
			}
		}
		
		}
	}

