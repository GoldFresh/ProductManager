package ru.netology.domain;

public class SmartPhone extends Product {
    private String producer;

    public SmartPhone () {
        super();
    }
    public SmartPhone(int ID, String name, int price, String producer){
        super(ID, name, price);
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
