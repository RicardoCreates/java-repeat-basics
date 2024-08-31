package de.ricardo;

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


    }
}