import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\nwb\\10122018\\mohini.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(1);
		cell.setCellType(CellType.STRING);
		cell.setCellValue("mohini");// ye ham java me eclispse me likh re h
		FileOutputStream fos = new FileOutputStream("D:\\nwb\\10122018\\mohiniCopy.xlsx");//outpot stream bnai oosi file ki 
		workbook.write(fos);//write krte chle gye
		fos.close();
		
		

	}

}
