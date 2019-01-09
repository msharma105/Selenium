import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msh104\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String mainWin = driver.getWindowHandle();
		System.out.println(mainWin);
		Set <String> st = driver.getWindowHandles();
		Iterator<String> IT =st.iterator();
		while(IT.hasNext())
		{
			String childWin = IT.next();
			if(!mainWin.equals(childWin))
					{
				    driver.switchTo().window(childWin);
				    driver.manage().window().maximize();
				    System.out.println(driver.switchTo().window(childWin).getTitle());
				     
					}
					
		}
		
		driver.switchTo().window(mainWin);

	}

}
