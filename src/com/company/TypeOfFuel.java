package com.company;

public class TypeOfFuel {
    protected String name = "fuel";
    protected double density = 1.;
    protected double price = 2.;

    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public double getDensyti(){
        return density;
    }
    public void print(){
        System.out.println(getName());
        System.out.println(getDensyti());
        System.out.println(getPrice());
    }

}
