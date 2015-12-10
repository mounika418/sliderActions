package packSlider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderActions {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception
	{
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
		
		WebElement dragSlider = driver.findElement(By.xpath("//div[@id='slider']/span"));
		
		new Actions(driver).dragAndDropBy(dragSlider, 200, 0).build().perform();
		
		Thread.sleep(2000);
		
		//new Actions(driver).clickAndHold(dragSlider).moveByOffset(100, 0).release().perform();
		
		//Thread.sleep(2000);
		
		
		driver.quit();
	}

}

