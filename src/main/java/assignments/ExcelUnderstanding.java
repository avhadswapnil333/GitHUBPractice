package assignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUnderstanding {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\SeneniumTutorial\\testData\\myfile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheetAt(1);
		System.out.println(sheet);
		
	}

}
