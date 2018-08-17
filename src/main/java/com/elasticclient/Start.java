package com.elasticclient;

import com.elasticclient.domain.Crime;
import com.elasticclient.domain.Pessoa;
import com.elasticclient.domain.Produto;
import com.elasticclient.services.CrimeClient;
import com.elasticclient.services.LoadProdutos;
import com.elasticclient.services.ProdutoClient;
import com.elasticclient.services.Sender;
import com.elasticclient.util.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Start {


    public static void main(String... args){
        CrimeClient crimeClient = new CrimeClient();
    /*    Sender sender1 = new Sender();
        Sender sender2 = new Sender();
        Sender sender3 = new Sender();
        Sender sender4 = new Sender();
        Sender sender5 = new Sender();

        sender1.start();
        sender2.start();
        sender3.start();
        sender4.start();
        sender5.start();*/

        Crime crime;
        for (int i=0;i<1; i++){
            crime = new Crime();
            crimeClient.insert(crime);
        }


    }
}
