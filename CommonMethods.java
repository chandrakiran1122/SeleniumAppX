package Test;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;


public class CommonMethods {
public static void main(String[] args) throws IOException {
	ArrayList <String>Testdata = new ArrayList();
	
	String Tcname = "userappx567";
	String SheetName ="Sheet1";
    Testdata =  getTestcaseData(SheetName,Tcname);
    FullSheet("Sheet1");
    for(String s:Testdata)
        System.out.print(s+" ");
}	  
	   public static ArrayList<String> getTestcaseData(String SheetName, String Tcname) throws IOException {
	        
	        FileInputStream file = new FileInputStream("C:\\Users\\Hp\\Desktop\\Automation Testing1\\Book1.xlsx");
	        
	        XSSFWorkbook wbook = new XSSFWorkbook(file);
	        System.out.println(wbook.getNumberOfSheets());
	        
	        ArrayList <String> getTestcaseData = new ArrayList();
	        
	        XSSFSheet sheet   = wbook.getSheet(SheetName);
	        Iterator <Row> row    =sheet.rowIterator();
	        while(row.hasNext()) 
	        {
	           Row specificrow  = row.next();
	           if(specificrow.getCell(0).getStringCellValue().equalsIgnoreCase(Tcname))
	           {
	        	   
	           Iterator <Cell> cell = specificrow.cellIterator();
	        
	         while(cell.hasNext())
	         {
	            Cell specificCellValue= cell.next();
	            String cell2= specificCellValue.getStringCellValue();
	            getTestcaseData.add(cell2);
	         }
	         break;
	       }
	    }
	        return getTestcaseData;   

	   }
	   public static void FullSheet(String SheetName) throws IOException
	   {
	       FileInputStream file = new FileInputStream("C:\\Users\\Hp\\Desktop\\Automation Testing1\\Book1.xlsx");
	        
	        XSSFWorkbook wbook = new XSSFWorkbook(file);
	        
	        ArrayList <String> testcasedata = new ArrayList<>();
	        
	        XSSFSheet sheet   = wbook.getSheet(SheetName);
	        Iterator <Row> row    =sheet.rowIterator();
	        while(row.hasNext())
	        {
	          Row specificrow     = row.next();
	   
	          Iterator <Cell> cell   = specificrow.cellIterator();
	        
	         while(cell.hasNext()) 
	         {
	            Cell specificCellValue= cell.next();
	            String cell2= specificCellValue.getStringCellValue();
	            System.out.println(cell2);
	         }
	         System.out.println();
	    }
	            
	   }
	   
}
