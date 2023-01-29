package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writeexcel {
public void EnterExcel(ArrayList<String> name , ArrayList<String> price)  {
		
		String path ="/Users/reravich/Documents/Revanth/Mydata/Book1.xlsx";
		String outputpath="/Users/reravich/Documents/Revanth/Mydata/Swiggy.xlsx";
		try {
			FileOutputStream fileoutputstream= new FileOutputStream(new File(outputpath));
			FileInputStream inputStream = new FileInputStream(new File(path));
			Workbook workbook = WorkbookFactory.create(inputStream);
			Sheet sheet = workbook.getSheet("Sheet1");
			int rang= name.size();
			for (int index = 1; index <= rang; index++) {
		                Row row = sheet.getRow(index);
		                Cell cellName = row.createCell(1);
		                if (cellName == null) {
		                	row = sheet.createRow(1); 
		                }
						Cell cellPrice = row.createCell(2);
		                cellName.setCellValue(name.get(index-1));
		                cellPrice.setCellValue(price.get(index-1));
		                }
			workbook.write(fileoutputstream);
			workbook.close();
			fileoutputstream.close();
			
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
		}
}

}
			
		

	
