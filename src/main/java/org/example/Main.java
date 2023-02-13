package org.example;

public class Main {
    public static void main(String[] args) {
        Broker broker = new Broker();
        new Fidelity(broker);
        new Ameritrade(broker);

        System.out.println("La bolsa está en 500");
        broker.setBolsa(500);
        System.out.println("La bolsa ahora está en 200");
        broker.setBolsa(200);
    }
}