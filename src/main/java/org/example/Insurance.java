package org.example;


import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if ( a >= 30 && a <= 65) {
            System.out.println("For this age the cost of insurance is 100 units");
        }
        else if (a >= 18 && a <= 29) {
            System.out.println("For this age the cost of insurance is 120 units");
        }
        else if (a >= 66 && a <= 79) {
            System.out.println("For this age the cost of insurance is 130 units");
            
        }
        else if (a < 18 && a > 79) {
            System.out.println("0");
            //doesn't work...

        }
    }

}
