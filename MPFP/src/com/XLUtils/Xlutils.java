package com.XLUtils;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xlutils 
{
	FileInputStream fi;
	FileOutputStream fo;
	XSSFWorkbook wb;
	XSSFSheet ws;
	XSSFRow row;
	XSSFCell cell;
	
	public String getStringData(String file, String sheet, int rownum, int cellnum) throws IOException
	{
		fi=new FileInputStream(file);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(sheet);
		row=ws.getRow(rownum);
		cell=row.getCell(cellnum);
		String data= cell.getStringCellValue();
		return data;
	}
	
	public int getNumricData(String file, String sheet, int rownum, int cellnum) throws IOException
	{
		fi=new FileInputStream(file);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(sheet);
		row=ws.getRow(rownum);
		cell=row.getCell(cellnum);
		int data=(int) cell.getNumericCellValue();
		return data;
	}
	

	public void setData(String file, String sheet, int rownum, int cellnum, String data) throws IOException
	{
		fi=new FileInputStream(file);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(sheet);
		row=ws.getRow(rownum);
		cell=row.createCell(cellnum);
		cell.setCellValue(data);
		fo=new FileOutputStream(file);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}
	
	
}
