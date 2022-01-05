package com.xworkz.ExcelProject.write;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.xworkz.ExcelProject.read.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) 
    {
        //Blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook(); 
         
        //Create a blank sheet
        Sheet sheet = workbook.createSheet("Sports Data");
          
        //This data needs to be written (Object[])
        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        data.put("1", new Object[] {"ID", "Sports", "Player","Country","Age"});
        data.put("2", new Object[] {1, "Criket", "Sachine","IND",45});
        data.put("3", new Object[] {2, "Hochey", "Pillai","IND",55});
        data.put("4", new Object[] {3, "Kabbadi", "Pavan","IND",29});
        data.put("5", new Object[] {4, "FootBall", "Neymar","BRAZIL",35});
          
        //Iterate over data and write to sheet
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset)
        {
            Row row = sheet.createRow(rownum++);
            Object [] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr)
            {
               Cell cell = row.createCell(cellnum++);
               if(obj instanceof String)
                    cell.setCellValue((String)obj);
                else if(obj instanceof Integer)
                    cell.setCellValue((Integer)obj);
            }
        }
        try
        {
            //Write the workbook in file system
            FileOutputStream out = new FileOutputStream(new File("demo1.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("demo1.xlsx written successfully on disk.");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
