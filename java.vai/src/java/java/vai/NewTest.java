package java.java.vai;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;
import java.util.Objects;

import org.testng.annotations.DataProvider;

public class NewTest { 
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }

  @DataProvider
  public void dpmethod()throws Exception {
	  FileInputStream fis=new FileInputStream("book1.xls");
	  Workbook wb=Workbook.getWorkbook(fis);
	  Sheet sh=wb.getSheet("Sheet1");
	  int rows=sh.getRows();
	  int col=sh.getColumns();
	  System.out.println("number of rows>>"+ rows);
	  System.out.println("number of column>>"+col);
	  String[][] arrdata=new String[rows][col];
	  for (int i=0;i<rows;i++){
		  for(int j=0; j<col;j++){
			  Cell cel=sh.getCell(j,i);//column,row
			 String data=cel.getContents();
			 System.out.println(data);
		  }
			  
			  
	  
    return;
	  }}}

