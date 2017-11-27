package Frame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.JFileChooser;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Workbook;
import jxl.format.Colour;
import jxl.format.VerticalAlignment;
import jxl.write.Font;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelFormat {
private ArrayList<String> liststudent = new ArrayList<>();
private ArrayList<String> liststudent2 = new ArrayList<>();
	private ArrayList<String> idlist = new ArrayList<>();
	
	private ArrayList<String> scorelist = new ArrayList<>();
	private ArrayList<String> gradelist = new ArrayList<>();
	private WritableWorkbook workbook;
	private String a="";
	private String title="";
	int t=0;
	int j=0;
	public void ReadFile() {
	//	JFileChooser c = new JFileChooser();
		try {
		JFileChooser c = new JFileChooser();
		c.showOpenDialog(null);
		File f3 = c.getSelectedFile();
	String	ss99 = f3.getAbsolutePath();
	Scanner scan = new Scanner(new File(ss99));
	
		
				while(scan.hasNext())
				{
					String h = scan.next();
					String h2 = scan.next();
						liststudent.add(h);
						liststudent2.add(h2);
					t++;
				    System.out.println(liststudent.get(j));
				    System.out.println(liststudent2 .get(j));
				    j++; 
				}
				
			
			
			
		}	catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		
		
	}
	
	
	public void WriteFile(){
		/*JFileChooser c = new JFileChooser();
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Sample sheet");
			
			Map<String, Object[]> data = new HashMap<String, Object[]>();
			data.put("1", new Object[] {"Emp No.", "Name", "Salary"});
			data.put("2", new Object[] {1d, "John", 1500000d});
			data.put("3", new Object[] {2d, "Sam", 800000d});
			data.put("4", new Object[] {3d, "Dean", 700000d});
			
			Set<String> keyset = data.keySet();
			int rownum = 0;
			for (String key : keyset) {
				Row row = sheet.createRow(rownum++);
				Object [] objArr = data.get(key);
				int cellnum = 0;
				for (Object obj : objArr) {
					Cell cell = row.createCell(cellnum++);
					if(obj instanceof Date) 
						cell.setCellValue((Date)obj);
					else if(obj instanceof Boolean)
						cell.setCellValue((Boolean)obj);
					else if(obj instanceof String)
						cell.setCellValue((String)obj);
					else if(obj instanceof Double)
						cell.setCellValue((Double)obj);
				}
			}
			
			try {
				
			
				FileOutputStream out = 
						new FileOutputStream(new File("Book1.xls"));
				workbook.write(out);
				out.close();
				System.out.println("Excel written successfully..");
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		*/
		
			try (FileOutputStream fileOut = new FileOutputStream(new File("Book1.xls"));){
				
				HSSFWorkbook workbook = new HSSFWorkbook();
				HSSFSheet worksheet = workbook.createSheet("POI Worksheet");
				
               Row heading = worksheet.createRow(0);
               heading.createCell(0).setCellValue("ID Student:");
			   heading.createCell(1).setCellValue("Grade:");
               for(int count=0;count<2;count++)
               {
            	   CellStyle taylor = workbook.createCellStyle();
            	   HSSFFont font = workbook.createFont();
            	   font.setItalic(false);
            	   font.setFontName(HSSFFont.FONT_ARIAL);
            	   font.setFontHeightInPoints((short)11);
            	   taylor.setFont(font);
            	   taylor.setVerticalAlignment(CellStyle.ALIGN_CENTER);
            	   heading.getCell(count).setCellStyle(taylor);
               }
               
               for(int count3=1;count3<idlist.size();count3++)
               {
            	   Row row = worksheet.createRow(count3);
            	   Cell cellid = row.createCell(0);
            	   cellid.setCellValue(idlist.get(count3)); 
            	   
            	   //Cell cellscore = row.createCell(1);
            	   //cellscore.setCellValue(scorelist.get(count3));
            	   
            	   Cell cellgrade = row.createCell(1);
            	   cellgrade.setCellValue(gradelist.get(count3));
               }
               
               for(int count2=0;count2<3;count2++)
               {
            	   worksheet.autoSizeColumn(count2);
               }
              // HSSFSheet sheet = workbook.createSheet("Calculate Simple Interest");

       	for(int i=0;i<t;i++)
       	{
       		Row dataRow = worksheet.createRow(i+1);
       		dataRow.createCell(0).setCellValue(liststudent.get(i));
       		dataRow.createCell(1).setCellValue(liststudent2.get(i));
       		
       	}
       		
       	
       	
           	Map<String, Object[]> data = new HashMap<String, Object[]>();
               
              
            	  
               
                workbook.write(fileOut);
               
                System.out.println("Write File Success!!!");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		  
        
		
		
	}
		

     

		
	
		
	
	
	public void print(ArrayList<String> a){
		for(int count=0;count<a.size();count++)
		{
			System.out.println(a.get(count));
		}
	}
	
	public static void main(String[] args) {
	   ExcelFormat f = new ExcelFormat();
		f.ReadFile();
	    f.WriteFile();
	   
            
			
			
		
	}
	
	
	   
	
}


