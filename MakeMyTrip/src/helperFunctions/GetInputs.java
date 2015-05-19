package helperFunctions;

import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class GetInputs {
	
	@BeforeTest
	//read the input file
	public String[] openInputFile(File fileName) throws IOException{
		
		FileInputStream inputFile = new FileInputStream(fileName);
		String paramValues[] = new String[7];
		Workbook w = new XSSFWorkbook(inputFile);
		
		Sheet sheet = w.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		for(int i=1;i<rowCount+1;i++){
			paramValues[i-1] = (sheet.getRow(i).getCell(1)).getStringCellValue().toString();
		}
		w.close();
		System.out.println(Arrays.toString(paramValues));
		return paramValues;
	}
	
	//Getter functions to read the parameters
	public String getLaunchURL(String[] paramValues){
		return paramValues[0];
	}
	
	public String getTravelType(String[] paramValues){
		return paramValues[1];
	}
	
	public String getBookingType(String[] paramValues){
		return paramValues[2];
	}
	
	public String getTravelOrigin(String[] paramValues){
		return paramValues[3];
	}
	
	public String getTravelDestination(String[] paramValues){
		return paramValues[4];
	}
	
	public String getDepartureDate(String[] paramValues){
		return paramValues[5];
	}
	
	public String getReturnDate(String[] paramValues){
		return paramValues[6];
	}			
}