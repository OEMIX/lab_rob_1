package com.company;

public class People {
    int customers ;//клієнти
    String cashire ; //касир
    String security ; //охорона

    public People(int customers, String cashire, String security) {
        this.customers = customers;
        this.cashire = cashire;
        this.security = security;
    }

    void average_amount() {
        System.out.println("Середня кількість клієнтів в магазин : "+ customers);
    }
    int cashiers_salary(){
        int monthly = 11000;
        int yearly = monthly*12;
        return yearly ;
    }
    int security_salary(){
        int monthly = 15200;
        int yearly = monthly*12;
        return yearly;
    }
}
