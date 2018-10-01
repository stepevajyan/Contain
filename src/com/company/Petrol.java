package com.company;

public class Petrol extends TypeOfFuel {
    @Override
    public double getDensyti(){
        return 0.75;
    }
    public String getName(){
        return "Petrol";
    }
    public double getPrice(){
        return 2.49;
    }
}
