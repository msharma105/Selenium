import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msh104\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://api.jquery.com/dblclick/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.switchTo().frame(0);
		
		WebElement we = driver.findElement(By.xpath("/html/body/div"));
		action.doubleClick(we).build().perform();
       driver.switchTo().parentFrame();
	}

}
