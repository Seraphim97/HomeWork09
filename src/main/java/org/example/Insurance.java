package org.example;


import java.util.Scanner;

public class Insurance {
    public int calculatePrice(int age) {
        int price; {

        } if (age >= 30 && age <=65) {
            price = 100;
        } else if (age >= 18 && age <= 29) {
            price = 120;
        } else if (age >= 66 && age <= 79) {
            price = 130;
        } else {
            return 0;
        }
        return price;

    }


    }


