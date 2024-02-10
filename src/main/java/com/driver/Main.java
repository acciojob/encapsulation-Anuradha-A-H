package com.driver;

public class Main {

    public static void main(String[] args){
        RWOnly r = new RWOnly();
//        r.name = "Anuradha";
//        System.out.println(r.name);
        r.setName("Anuradha");
        System.out.println(r.getName());

    }
}