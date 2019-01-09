import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickandCopy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msh104\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement ab = driver.findElement(By.className("context-menu-one"));
		action.contextClick(driver.findElement(By.className("context-menu-one"))).build().perform();
		System.out.println(ab.getText());
				

	}

}
