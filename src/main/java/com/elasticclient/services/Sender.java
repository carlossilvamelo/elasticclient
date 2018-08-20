package com.elasticclient.services;

import com.elasticclient.domain.Crime;
import com.elasticclient.domain.Pessoa;

public class Sender extends Thread {

    public void run() {
        CrimeClient crimeClient = new CrimeClient();

        Crime crime;
        for (int i=0;i<1000; i++){
            crime = new Crime();
            crimeClient.insert(crime);
        }
    }
}
