package com.example.app;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        double elmaKg, armutKg, domatesKg, muzKg, patlıcanKg, tutar;
        System.out.println("Elma KG:");
        elmaKg=input.nextDouble();
        System.out.println("Armut KG:");
        armutKg=input.nextDouble();
        System.out.println("Domates KG:");
        domatesKg=input.nextDouble();
        System.out.println("Muz KG:");
        muzKg=input.nextDouble();
        System.out.println("Patlıcan KG:");
        patlıcanKg=input.nextDouble();
        input.close();

        tutar=(armutKg*2.14) +(elmaKg*3.67)+(domatesKg*1.11)+(muzKg*0.95)+(patlıcanKg*5.00);
        System.out.println("Tutar :" + tutar);

    }
}