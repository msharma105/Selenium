import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msh104\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.softwaretestingmaterial.com/first-selenium-webdriver-script/");
 //System.out.println( driver.getTitle());
 driver.get("https://www.google.co.in/?gws_rd=ssl#q=softwaretestingmaterial.com");
  //driver.close();
 driver.manage().window().maximize();
//String s =driver.findElement(By.xpath("//div[contains(@class,'item mix skin odd flat selenium tutorial')]")).getText();
// WebElement link = driver.findElement(By.className("item mix skin odd flat selenium tutorial "));
 //System.out.println(s);
 List<WebElement> link = driver.findElements(By.xpath("//*[@id='rso']/div[1]/div/div/table"));
 for(WebElement e: link)
 {
	 System.out.println(e.getText()); 
 }
 
	}

}
