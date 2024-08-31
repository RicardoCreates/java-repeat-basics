package de.ricardo;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        //example of declaring a variable
        int age = 35;
        double pi = 3.14;
        boolean isValid = true;
        char letter = 'c';

        //example of variables with different data types
        String name = "John Doe";

        //Beispiel für die Verwendung von Operatoren
        int x = 10;
        int y = 5;

        int sum = x + y;
        System.out.println(sum);
        int difference = x - y;
        System.out.println(difference);
        int product = x * y;
        System.out.println(product);
        int quotient = x / y;
        System.out.println(quotient);

        boolean isEqual = x == y;
        System.out.println(isEqual);
        boolean isGreater = x > y;
        System.out.println(isGreater);
        boolean logicalAnd = x > 0 && y >0;
        System.out.println(logicalAnd);
        boolean logicalOr = x > 0 || y > 0;
        System.out.println(logicalOr);
        boolean logicalNot = !(x > y);
        System.out.println(logicalNot);

        //If Else

        int age2 = 25;

        if (age2 >= 18) {
            System.out.println("I'm 18");
        } else {
            System.out.println("I'm not 18");
        }

        int score = 90;

        if (score >= 90) {
            System.out.println("Sehr gut");
        } else if (score >= 80) {
            System.out.println("Gut gemacht!");
        } else if (score >= 70) {
            System.out.println("Nicht schlecht.");
        } else {
            System.out.println("Mehr Übung nötig");
        }

        int result = addNumbers(10, 20);
        System.out.println("Ergebnis: " + result);

        greetUser("Max");
        System.out.println(isEven(22));
    }


    public static int addNumbers(int a, int b) {
        int sum2 = a + b;
        return sum2;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static void greetUser(String name2) {
        System.out.println("Hallo, " + name2 + "!");
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}