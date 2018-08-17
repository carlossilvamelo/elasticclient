package com.elasticclient.util;

import com.elasticclient.domain.Crime;
import com.elasticclient.domain.Pessoa;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParser {

    public static String pessoaToJson(Pessoa pessoa){

            ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(pessoa);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;

    }


    public static String crimeToJson(Crime crime){

        ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(crime);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;

    }


}
