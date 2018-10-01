package com.company;

public class Diesel extends TypeOfFuel {
    @Override
    public double getDensyti(){
        return 0.84;
    }
    public String getName(){
        return "Diesel";
    }
    public double getPrice(){
        return 2.39;
    }
}
