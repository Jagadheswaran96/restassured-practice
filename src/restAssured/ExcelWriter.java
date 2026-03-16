package restAssured;

import org.apache.poi.xssf.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriter {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("Sheet1");

        XSSFRow row = sheet.createRow(0);
        row.createCell(0).setCellValue("Username");
        row.createCell(1).setCellValue("Status");
        row.createCell(2).setCellValue("Response");

        XSSFRow row1 = sheet.createRow(1);
        row1.createCell(0).setCellValue("Automation");
        row1.createCell(1).setCellValue(200);
        row1.createCell(2).setCellValue(Boolean.TRUE);

        FileOutputStream fos = new FileOutputStream("response.xlsx");
        wb.write(fos);
        wb.close();

	}

}
