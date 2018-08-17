package com.elasticclient.services;

import com.elasticclient.domain.Crime;
import com.elasticclient.domain.Pessoa;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class CrimeClient {
    static final String HOST = "http://localhost:9200/";

    public void insert(Crime crime){
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Crime> requestBody = new HttpEntity<>(crime, headers);
        Crime result = restTemplate.postForObject(HOST+"/cidade/crimes", requestBody, Crime.class);
        System.out.println(result.toString());

    }
}
