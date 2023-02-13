package org.example;

public class Ameritrade extends Brokerage{
    public Ameritrade (Broker broker) {
        this.broker = broker;
        this.broker.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Ameritrade ha sido informada de que la bolsa ha cambiado a: " + broker.getBolsa());
    }
}
