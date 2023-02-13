package org.example;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Brokerage> brokerages = new ArrayList<>();
    private int bolsa;

    public int getBolsa(){
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
        notifyAllBrokerages();
    }

    public void attach (Brokerage brokerage){
        brokerages.add(brokerage);
    }

    public void notifyAllBrokerages(){
        for (Brokerage brokerage:brokerages) {
            brokerage.update();
        }
    }
}
