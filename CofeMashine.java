package Homework;

import java.util.Scanner;

public class CofeMashine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pls what you wanna drink " +
                "(1 = espresso ; 2 = Americano; 3 = Capuccino ; 4 = tee) : ");
        int drink = sc.nextInt();
        sc.close();

        if (drink == 1){
            System.out.println("Start Espresso");
        }

        else if (drink == 2){
            System.out.println("Start Americano");
        }

        else if (drink == 3) {
            System.out.println("Start Capuccino");
        }

        else if (drink == 4) {
            System.out.println("Start Tee");
        }

        else
            System.out.println("Repeat please, it's incorect.");
    }
}
