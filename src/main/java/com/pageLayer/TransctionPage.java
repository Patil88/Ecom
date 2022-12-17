package com.pageLayer;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.testBase.TestBase;

public class TransctionPage extends TestBase{

	
	
	public TransctionPage()
	{
	PageFactory.initElements(driver,this);	
	}
	/////obj rep//////
	By transacton_btn=By.xpath("//a[text()='Transactions']");
	By row=By.xpath("//table[@class='table table align-middle table-nowrap']/tbody/tr");
	By col=By.xpath("(//table[@class='table table align-middle table-nowrap'])[1]/thead/tr/th");
	
	/////action method/////
	public void clickTransctionPage()
	{
		
		driver.findElement(transacton_btn).click();
	}
	///////////print data on console/////////////////
	public void getData()
	{
		
		int rownum=driver.findElements(row).size();
		int colnum=driver.findElements(col).size();
		for(int r=1;r<=rownum;r++)
		{
			for(int c=1;c<=colnum;c++)
			{
				String data=driver.findElement(By.xpath("(//table[@class='table table align-middle table-nowrap'])[1]/tbody/tr["+r+"]/td["+c+"]")).getText();
			
				
				System.out.print(data+"  ");	
			}
			System.out.println();
		}
		
//String data=driver.findElement(By.xpath("(//table[@class='table table align-middle table-nowrap'])/tbody/tr[4]/td[2]")).getText();
//System.out.println(data);
	}
	
	//////////print data in excel/////////////////
	public void enterdataExcel() throws IOException
	{
		
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("dalal_excel_data");
		

		int rownum=driver.findElements(row).size();
		int colnum=driver.findElements(col).size();
		String[] data=new String[colnum];
		for(int r=0;r<rownum;r++)
		{
			XSSFRow ro=sheet.createRow(r);
			List<WebElement> Entire_row=driver.findElements(By.xpath("(//table[@class='table table align-middle table-nowrap'])/tbody/tr["+(r+1)+"]/td"));

			for(int c=0;c<colnum;c++)
			{
				data[c]=Entire_row.get(c).getText();

				XSSFCell cell=ro.createCell(c);
				
				cell.setCellValue(data[c]);
			}
		}
		String path="D:\\eclipseworkspace\\newWorkspace\\transactionData2.xlsx";
		FileOutputStream out=new FileOutputStream(path);
		wb.write(out);
		System.out.println("File generated");
		out.close();
	}
	
	
	
}
