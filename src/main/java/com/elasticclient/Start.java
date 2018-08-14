package com.elasticclient;

import com.elasticclient.domain.Produto;
import com.elasticclient.services.LoadProdutos;
import com.elasticclient.services.ProdutoClient;
import com.elasticclient.util.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Start {


    public static void main(String... args){
        ProdutoClient produtoClient = new ProdutoClient();
        LoadProdutos loadProdutos = new LoadProdutos();
        //produtoClient.getTest();

       // System.out.println(JsonParser.produtoToJson(loadProdutos.loadProducts().get(1)));
        for (Produto p: loadProdutos.loadProducts()) {
            produtoClient.insert(p);
        }


    }
}
