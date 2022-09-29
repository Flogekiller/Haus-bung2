package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 um Menü anzuzeigen");
        while(scanner.nextInt() != 4) {
            System.out.println("Choose calculator: ");
            System.out.println("1- Relational calculator");
            System.out.println("2- Vector calculator");
            System.out.println("3- Complex calculator");
            System.out.println("4- Exit calculator");
            int eingabe = scanner.nextInt();
            switch (eingabe)
            {
                case 1:

                    break;
            }

        }
    }


}
