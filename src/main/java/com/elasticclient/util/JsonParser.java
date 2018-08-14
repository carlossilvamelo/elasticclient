package com.elasticclient.util;

import com.elasticclient.domain.Produto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParser {

    public static String produtoToJson(Produto produto){

            ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(produto);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;

    }
}
