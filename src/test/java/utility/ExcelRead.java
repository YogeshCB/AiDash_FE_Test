package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead
{
	File src;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sh1;
	int i=0,j=1;
	HashMap <String, String> hmap = new HashMap<String, String>();
	
	public ExcelRead()
	{
		try
		{
			src =  new File("./Test-Input/testdat.xlsx");
			
			fis =  new FileInputStream(src);
			
			wb = new XSSFWorkbook(fis);
			
			sh1 = wb.getSheetAt(0);
				
			while(sh1.getRow(i).getCell(j).getRawValue()!= null)
			{
				String s1 = sh1.getRow(i).getCell(0).getStringCellValue();
				String s2 = sh1.getRow(i).getCell(1).getStringCellValue();
				//System.out.println(" 1:"+s1 + " 2:"+s2);
				hmap.put(s1, s2);
				i++;
			}
			//System.out.println(hmap);
			fis.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception: "+e);
		}
	}
	
	public String reteriveInputFromExcel(String input)
	{
		if(hmap.containsKey(input))
		{
			//System.out.println("Value available in Hash Map");
			String value = hmap.get(input);
			return value;
		}
		else
		{
			//System.out.println("Value not found in HashMap");
			return null;
		}
	}
}
