package com.company;

public class Products {
    String fish;//риба
    String meat;//м'ясо
    String baking;//випічка

    public Products(String fish, String meat, String beking) {
        this.fish = fish;
        this.meat = meat;
        this.baking = beking;
    }

    void typesOFmeat() {
        System.out.println("На прилавку м'ясного відділення є : " + meat);
        System.out.println("На прилавку рибного відділення є : " +fish);
        System.out.println("На прилавку з випічки є : " +baking);
    }
    int price(){
        int chicken_price =79;
        int veal_price = 189 ;
        int lamb_price = 165;
        int s = (chicken_price+veal_price+lamb_price)/3;
        return s;

    }

}
