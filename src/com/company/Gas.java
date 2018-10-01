package com.company;

public class Gas extends TypeOfFuel {

    @Override
    public double getDensyti(){
        return 0.454;
    }
    public String getName(){
        return "Liquid gas";
    }
    public double getPrice(){
        return 1.45;
    }
}
