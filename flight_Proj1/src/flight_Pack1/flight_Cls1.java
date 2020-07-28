package flight_Pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flight_Cls1 {

	public static void main(String[] args) throws InterruptedException {
		// This is a testcase to launch the Quantas website and then click on book > Flight> inorder to search a flight.
	
		// System Property for Chrome Driver   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aadyak\\eclipse-workspace\\basic_seli\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//Launch the Quantas WebSite 
		driver.get("https://www.qantas.com/us/en.html");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	//Maximize the window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	//Click on "Book" Link
		driver.findElement(By.linkText("Book")).click();  
	//Click on "Flights" Link
		driver.findElement(By.linkText("Flights")).click();  
		
	// Scrolldown the page to fill further details for booking the flight. 
		JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 600)");
				
        
        String actualUrl = driver.getCurrentUrl(); 
       
        
        if (actualUrl.equals("https://www.qantas.com/us/en/book-a-trip/flights.html"))  
        {  
        System.out.println("Verification Successful - The correct Url is opened.");  
        }  
        else  
        {  
        System.out.println("Verification Failed - An incorrect Url is opened.");  
        }  
	}
	

}




