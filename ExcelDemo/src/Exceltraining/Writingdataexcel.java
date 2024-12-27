package Exceltraining;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writingdataexcel {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Emp Info");

		Object empdata [][]= {{"Name","Age","Mail"},
				{"John Doe",30,"john@test.com"},
				{"Jane Doe",28,"jane@test.com"},
				{"Bob smith",35,"Bob@test.com"},
				{"Swapnil",37,"Swapnil@test.com"}};
		int rows=empdata.length;
		int cols=empdata[0].length;
		
		System.out.println(rows);
		System.out.println(cols);
		
		for (int r=0;r<rows;r++) {
			XSSFRow row=sheet.createRow(r);
			
			
			
			for (int c=0;c<cols;c++) {
				XSSFCell cell=row.createCell(c);
					
				Object value=empdata[r][c];
				
				if (value instanceof String)
					cell.setCellValue((String)value);
				
				if (value instanceof Integer)
					cell.setCellValue((Integer)value);
				
				if (value instanceof String)
					cell.setCellValue((String)value);

				
					String filepath=".\\Resourse\\emp.xlsx";
					FileOutputStream Outputstream=new FileOutputStream(filepath);
					workbook.write(Outputstream);
					Outputstream.close();
									
			
		}
			System.out.println("Emp.xlsx file written successfully");

}
}

	
	}