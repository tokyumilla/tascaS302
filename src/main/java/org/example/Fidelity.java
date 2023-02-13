package org.example;

public class Fidelity extends Brokerage{
    public Fidelity (Broker broker) {
        this.broker = broker;
        this.broker.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Fidelity ha sido informada de que la bolsa ha cambiado a: " + broker.getBolsa());
    }
}
