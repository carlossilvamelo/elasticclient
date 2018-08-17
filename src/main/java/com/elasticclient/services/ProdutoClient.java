package com.elasticclient.services;

import com.elasticclient.domain.Pessoa;
import com.elasticclient.domain.Produto;
import com.elasticclient.util.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProdutoClient {

    static final String HOST = "http://localhost:9200/";

    @Autowired
    private LoadProdutos loadProdutos;


    public void loadAll(){

    }

    public void getTest(){
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(HOST, String.class);
        System.out.println(result);

    }

    public void insert(Pessoa pessoa){
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Pessoa> requestBody = new HttpEntity<>(pessoa, headers);
        Pessoa result = restTemplate.postForObject(HOST+"/cidade/pessoa", requestBody, Pessoa.class);
        System.out.println(result.toString());

    }


}
