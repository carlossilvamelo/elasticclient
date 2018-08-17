package com.elasticclient;

import com.elasticclient.domain.Crime;
import com.elasticclient.domain.Produto;
import com.elasticclient.services.LoadCrime;
import com.elasticclient.util.JsonParser;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Load {

    public static void main(String... args){
        try {
            Workbook workbook = Workbook.getWorkbook(new File("C:\\Users\\cmelo\\CARLOS\\workspace\\elasticclient\\src\\main\\resources\\crimesRS.xls"));
            Sheet sheet = workbook.getSheet(0);
            Produto produto = null;
            LoadCrime loadCrime = new LoadCrime();

            List<Crime> crimeList = loadCrime.loadCrimes();

            for (Crime c: crimeList) {
                System.out.println(JsonParser.crimeToJson(c));
            }




        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
    }
}
