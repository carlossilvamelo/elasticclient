package com.elasticclient.services;

import com.elasticclient.domain.Produto;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class LoadProdutos {


    public List<Produto> loadProducts(){
        List<Produto> produtoList = new ArrayList<Produto>();
        try {
            Workbook workbook = Workbook.getWorkbook(new File("C:\\Users\\cmelo\\CARLOS\\workspace\\elastic\\src\\main\\resources\\tabela.xls"));
            Sheet sheet = workbook.getSheet(0);
            Produto produto = null;

            for(int i = 0; i < sheet.getRows(); i++){
                produto = new Produto();
                Cell col1 = sheet.getCell(0, i);
                Cell col2 = sheet.getCell(1, i);
                Cell col3 = sheet.getCell(2, i);
                Cell col4 = sheet.getCell(3, i);
                Cell col5 = sheet.getCell(4, i);
                produto.setProduto(col1.getContents());
                produto.setAno(col2.getContents());
                produto.setEstado(col3.getContents());
                produto.setRefinaria(col4.getContents());
                produto.setUnidade(col5.getContents());
                produtoList.add(produto);

            }





        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }

        return produtoList;
    }
}
