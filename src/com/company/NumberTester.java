package com.company;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.channels.SelectableChannel;
import java.util.Scanner;

public class NumberTester
{
    NumberTest oddTester;
    NumberTest primeTester;
    NumberTest palindromeTester;
    String fileName;

    public NumberTester(String fileName) {
        this.fileName = fileName;
    }

    public static void main(String[] args) {
        NumberTester numberTester = new NumberTester("Test.csv");
        numberTester.testFile();
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }
    public void testFile()
    {
        File file = new File("C:\\Users\\flori\\Documents\\Schule\\3.Klasse\\POS\\Hausübung2\\Haus-bung2\\src\\com\\company\\Test.csv");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            int anzahl = scanner.nextInt();
            for (int i = 0; i < anzahl; i++) {
                int auswahl = scanner.nextInt();
                switch (auswahl) {
                    case 1:
                        int number = scanner.nextInt();
                    setOddEvenTester(oddTester ->
                    {
                        if (number % 2 == 0) {
                            System.out.println("Even");
                            return true;
                        } else {
                            System.out.println("Not Even");
                            return false;
                        }
                    });
                    oddTester.testNumber(number);
                    break;

                    case 2:
                        number = scanner.nextInt();
                        setPrimeTester(primeTester ->
                                {
                                    for (int j = 2; j * j <= number; j++) {
                                        if (number % j == 0) {
                                            System.out.println("No prime");
                                            return false;
                                        }
                                    }
                                    System.out.println("Prime");
                                    return true;
                                });

                        primeTester.testNumber(number);
                        break;

                    case 3:
                        number = scanner.nextInt();
                        String numberStr = String.valueOf(number);

                        setPalindromeTester(primeTester ->
                        {
                            String normal = "",umgekehrt = "";
                            int length = numberStr.length();
                            normal = numberStr;
                            for (int k = length - 1; k >= 0; k--)
                                umgekehrt = umgekehrt + normal.charAt(k);
                            if (normal.equals(umgekehrt)) {
                                System.out.println("palindrome");
                                return true;
                            }
                            else{
                                System.out.println("no palindrome");
                                return false;
                        }



                }); palindromeTester.testNumber(number);
                        break;
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
