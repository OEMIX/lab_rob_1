package com.company;

public class Shop {
    String storage;//склад
    String mainHall;//головний зал
    String toilet;//туалет

    public Shop(String storage, String mainHall, String toilet) {
        this.storage = storage;
        this.mainHall = mainHall;
        this.toilet = toilet;

        }

        void main_hall(){
        int height =2;
        int width = 10;
        int length = 21;
        System.out.println("Площа магазину : "+height*width*length);
    }
    int storage(){
        int height =2;
        int width = 6;
        int length = 29;
        return height*width*length;
    }

}
