package helperFunctions;

import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;

import jxl.Cell;
//import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class GetInputs {
	
	@BeforeTest
	//read the input file
	public void openInputFile(String fileName) throws IOException{
		
		File inputFile = new File(fileName);
		String paramValues[] = new String[7];
		Cell param;
		Workbook w;
		
		try{
			w = Workbook.getWorkbook(inputFile);
			Sheet sheet = w.getSheet(0);
			
			for(int i=1;i<sheet.getRows();i++){
				param = sheet.getCell(i, 1);
				paramValues[i-1] = param.getContents();
			}
		} catch(BiffException e){
			e.printStackTrace();
		}
		assignValues(paramValues);
	}
	
	//Assign input values to attributes
		public void assignValues(String[] paramValues){
				
			String launchURL=paramValues[0];
			String travelType=paramValues[1];
			String bookingType=paramValues[2];
			String travelOrigin=paramValues[3];
			String travelDestination=paramValues[4];
			String departureDate=paramValues[5];
			String returnDate=paramValues[6];
		}
			
}