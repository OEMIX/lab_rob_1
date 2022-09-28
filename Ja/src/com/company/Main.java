package com.company;
public class Main {

    public static void main(String[] args) {

        Products pro = new Products("Лосось, Матіс, Скумбрія","Телятина, баранина, курятина","Хліб, булочки, печиво");
        pro.typesOFmeat();
        System.out.println("Середня ціна м'яса :"+ pro.price());
        System.out.println();

        People p = new People(14,"Наташа","Вітька");
        p.average_amount();
        System.out.println("Річна зарплата касира : "+ p.cashiers_salary());
        System.out.println("Річна зарплата охоронця : "+ p.security_salary());
        System.out.println();

        Shop s = new Shop("Склад","головний зал","туалет");
        s.main_hall();
        System.out.println("Площа складу : "+s.storage());
    }
}