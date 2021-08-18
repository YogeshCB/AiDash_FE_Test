package commonMethods;

import utility.ExcelRead;

public class ReadInput {
	
	ExcelRead excel;
	
	public ReadInput()
	{
		excel = new ExcelRead();
	}
	
	public String getValue(String input)
	{
		String value = excel.reteriveInputFromExcel(input);
		if(value.charAt(0)=='"')
			value=value.substring(1);
		return value;
	}

}
