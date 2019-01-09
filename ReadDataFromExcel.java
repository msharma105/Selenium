import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 


public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\msh104\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		FileInputStream fis = new FileInputStream("D:\\nwb\\10122018\\mohini.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		//XSSFWorkbook workbook = new XSSFWorkbook(f1);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		System.out.println(cell);
		
		
		

	}

}
