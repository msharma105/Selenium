import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msh104\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		driver.manage().window().maximize();
		WebElement photo = driver.findElement(By.name("uploadfile"));
		photo.sendKeys("D:\\assign\\17-04-2018\\allocation_6to8am.xlsx");
		
	}

}
