import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Alertdemo {
	public static void main(String[] args) throws InterruptedException {
	//public void alertwindow() throws InterruptedException

	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msh104\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id = 'content']/button")).click();
		Thread.sleep(10000);
		//Alert alert = new Alert ();
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		//al.accept();
		al.dismiss();
		
		
		
		
		
	}

}}
