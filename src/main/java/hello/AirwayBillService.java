/**
 * 
 */
package hello;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Iterator;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

/**
 * @author reza.lesmana
 *
 */
@Service
public class AirwayBillService {

	private static final String FILE_NAME = "D:/Data/AWB.xlsx";
	
	public AirwayBill getAirwayBillInfo(String airwayBillNumber) {
		try {

            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = datatypeSheet.iterator();
            
            iterator.next(); //skip first
            
            AirwayBill awb = new AirwayBill();

            while (iterator.hasNext()) {
            	
            	//AWB_NUMBER;AWB_STATUS;PRICE_PER_KG;WEIGHT;INSURANCE_CHARGE;GIFT_WRAP_CHARGE;OTHER_CHARGE;TOTAL_CHARGE

                Row currentRow = iterator.next();
                Cell awbNumberCell = currentRow.getCell(0);
                if(StringUtils.equalsIgnoreCase(airwayBillNumber, awbNumberCell.getStringCellValue())) {
                	awb.setAirwayBillNumber(awbNumberCell.getStringCellValue());
                    Cell awbStatusCell = currentRow.getCell(1);
                    awb.setAirwayBillStatus(awbStatusCell.getStringCellValue());
                    Cell awbPricePerKgCell = currentRow.getCell(2);
                    awb.setPricePerKg(new BigDecimal(awbPricePerKgCell.getNumericCellValue()));
                    Cell awbWeightCell = currentRow.getCell(3);
                    awb.setWeight(new BigDecimal(awbWeightCell.getNumericCellValue()));
                    Cell awbInsuranceChargeCell = currentRow.getCell(4);
                    awb.setInsuranceCharge(new BigDecimal(awbInsuranceChargeCell.getNumericCellValue()));
                    Cell awbGiftWrapChargeCell = currentRow.getCell(5);
                    awb.setGiftWrapCharge(new BigDecimal(awbGiftWrapChargeCell.getNumericCellValue()));
                    Cell awbOtherChargeCell = currentRow.getCell(6);
                    awb.setOtherCharge(new BigDecimal(awbOtherChargeCell.getNumericCellValue()));
                    Cell awbTotalChargeCell = currentRow.getCell(7);
                    awb.setTotalCharge(new BigDecimal(awbTotalChargeCell.getNumericCellValue()));
                }   
            }
            
            workbook.close();
            excelFile.close();
            
            return awb;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		return null;
	}
	
	

}
