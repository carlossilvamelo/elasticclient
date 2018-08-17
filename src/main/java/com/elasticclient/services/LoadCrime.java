package com.elasticclient.services;

import com.elasticclient.domain.Crime;
import com.elasticclient.domain.Produto;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoadCrime {

    public List<Crime> loadCrimes(){
        List<Crime> crimeList = new ArrayList<Crime>();
        try {
            Workbook workbook = Workbook.getWorkbook(new File("C:\\Users\\cmelo\\CARLOS\\workspace\\elasticclient\\src\\main\\resources\\crimesRS.xls"));
            Sheet sheet = workbook.getSheet(0);
            Crime crime = null;



            for(int i = 1; i < sheet.getRows(); i++){
                crime = new Crime();
                Cell col1 = sheet.getCell(0, i);
                Cell col2 = sheet.getCell(1, i);
                Cell col3 = sheet.getCell(2, i);
                Cell col4 = sheet.getCell(3, i);
                Cell col5 = sheet.getCell(4, i);
                Cell col6 = sheet.getCell(5, i);
                Cell col7 = sheet.getCell(6, i);
                Cell col8 = sheet.getCell(7, i);
                Cell col9 = sheet.getCell(8, i);
                Cell col10 = sheet.getCell(9, i);
                Cell col11 = sheet.getCell(10, i);
                Cell col12 = sheet.getCell(11, i);
                Cell col13 = sheet.getCell(12, i);
                crime.setMunicipio(col1.getContents());
                crime.setHomicidioDoloso(Integer.parseInt(col2.getContents()));
                crime.setVitimasHomicidioDoloso(Integer.parseInt(col3.getContents()));
                crime.setLatrocinio(Integer.parseInt(col4.getContents()));
                crime.setFurtos(Integer.parseInt(col5.getContents()));
                crime.setFurtoAnimais(Integer.parseInt(col6.getContents()));
                crime.setFurtosVeiculo(Integer.parseInt(col7.getContents()));
                crime.setRoubos(Integer.parseInt(col8.getContents()));
                crime.setRouboVeiculo(Integer.parseInt(col9.getContents()));
                crime.setEstelionato(Integer.parseInt(col10.getContents()));
                crime.setDelitosArmasMunicoes(Integer.parseInt(col11.getContents()));
                crime.setPosseDrogas(Integer.parseInt(col12.getContents()));
                crime.setTraficoDrogas(Integer.parseInt(col13.getContents()));
                crimeList.add(crime);



            }
            crimeList.remove(crimeList.size()-1);




        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }

        return crimeList;
    }
}
