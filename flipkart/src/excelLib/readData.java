package excelLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readData {
	
	public void reading() throws InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Chonam\\Desktop\\Book2.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		
	    org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet("Book1");
	    Row row=sh.getRow(1);
	    
	    String data=row.getCell(1).getStringCellValue();
	    
	    System.out.println(data);
//	    for(int i=0;i<sh.getLastRowNum();i++)
//	    {
//	    	String actText="UserName";
//	    	
//	    	String expText=row.getCell(i).getStringCellValue();
//	    	
//	    	if(actText.equals(expText))
//	    			{
//	    		System.out.println(expText);
//	    			}
//	    }
	    
	}
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		readData r1=new readData();
		r1.reading();
	}

}
