package restAssured;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String args[]) throws IOException {

		String fileName = "request.xlsx";
		FileInputStream fis = new FileInputStream(new File(fileName));
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);

		List<String[]> requestData = new ArrayList<>();

		for (Row row : sheet) {

			String username = row.getCell(0).getStringCellValue();
			String password = row.getCell(1).getStringCellValue();

			requestData.add(new String[]{username, password});
		}

		wb.close();
//		Printing using forEach and Arrays.toString()
		requestData.forEach(array -> System.out.println(Arrays.toString(array)));


	}
}