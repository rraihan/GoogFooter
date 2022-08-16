package clickSetting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ClickSettingLoops {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.google.com/");

		driver.manage().window().maximize();
		

		System.out.println(driver.manage().window().getSize());
		// Create object of Dimensions class
		Dimension d = new Dimension(480, 720);
		// Resize the current window to the given dimension
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());

		Thread.sleep(2000);

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,50)");

		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.switchTo().frame("callout");
		driver.findElement(By.cssSelector(".QlyBfb>button")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ayzqOc.pHiOh")).click(); // setting

		Thread.sleep(5000);

		List<WebElement> mapLinks = driver.findElements(By.xpath("(//g-menu-item[@role='none'])"));
		int size = mapLinks.size();

		System.out.println(size);

		for (int i = 0; i < size; i++) {
			
				
			mapLinks.get(i).click();
	
			   
			 		
			


			Thread.sleep(5000);

			for (int j = 0; j <=1; j++) {
				driver.navigate().back();
				Thread.sleep(5000);

			}

		}

	}
		
		
		

		
		
		
		
	}


