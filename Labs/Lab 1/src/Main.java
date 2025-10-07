package src;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String witam = "12";

        System.out.print("Enter a number: ");
       int liczba = Integer.parseInt(input.next());
//       int liczba2 = Integer.parseInt((args[0]));
        System.out.println(" ");

        for (int i = 1; i <= liczba; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("x");
            }

            System.out.println(" ");

        }
        System.out.print(" ");
        //reversed
        System.out.println("Reversed");
        for (int i = liczba - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j =0; j<liczba-i; j++) {
                System.out.print("x");
            }
            System.out.println(" ");
        }



    }
}