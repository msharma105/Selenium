
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msh104\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.navigate().refresh();
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//select[@name ='dropdown']")).click();
		WebElement dd = driver.findElement(By.name("dropdown"));
		Select sdd = new Select (dd);
		sdd.selectByIndex(5);
	List <WebElement>Lists = sdd.getOptions();
	for(WebElement ll : Lists)
	{
		System.out.println(ll.getText());
	}
		

	}

}
