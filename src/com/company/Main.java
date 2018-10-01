package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TypeOfFuel typeOfFuel = new TypeOfFuel();
        Petrol petrol = new Petrol();
        Gas gas = new Gas();
        Diesel diesel = new Diesel();

        Scanner input = new Scanner(System.in);

        System.out.println("please enter the code of container which density do you want to calculate \n " + "1)Petrol \n 2)Diesel \n 3)Liquid gas");
        String text = input.nextLine();

        switch (text) {
            case "1":
                System.out.println("Petrol Density and price :\n");
                petrol.print();
                break;

            case "2":
                System.out.println("Diesel  Density and price: \n");
                diesel.print();
                break;

            case "3":
                System.out.println("Liquid gas Density and price:\n");
                gas.print();
                break;
            default:
                System.out.println("Unfortunately the density of the substance you selected I cannot calculate");
        }
        System.out.println("do you want to calculate how ");
        String text = input.nextLine();

    }
}
