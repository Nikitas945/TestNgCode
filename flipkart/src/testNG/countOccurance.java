package testNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class countOccurance {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		
////		String s1="aaabbccc";
//		boolean flag=false;
//		int ct=0;
//		int i,p,j;
//		
//		int ar2[]={'a','d','a','a'};
////		ArrayList<String > list=new ArrayList<>();
//		
//		for( i=0;i<ar2.length;i++)
//		{
//			if(ct!=0)
//			{
//				for( p=i-1;p>=0;p--)
//				{
//					if(ar2[p]==ar2[i])
//						flag=true;
//					
//				}
//			}
//			if(flag)
//			{
//				break;
//			}
//			else
//			{		
//				for( j=i+1;j<ar2.length;j++)
//				{
//					if(ar2[i]==ar2[j])
//						ct++;
//				}
//				System.out.println( " "+ ct);
//				
//			}
//			
//		}
//		
//
//	}
	
	
	public void reading() throws InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Chonam\\Desktop\\Book2.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		
	    org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet("Book1");
	    Row row=sh.getRow(6);
	    
	    for(int i=0;i<sh.getLastRowNum();i++)
	    {
	    	String actText="UserName";
	    	
	    	String expText=row.getCell(i).getStringCellValue();
	    	
	    	if(actText.equals(expText))
	    			{
	    		System.out.println(expText);
	    			}
	    }

	
}
}
