package com.company;

public class Main {

    int globalVar = 9;

    public static void main(String[] args) {

        int localVar = 6;

        // local variable is a variable that is only
        // available within the method it was declared in.

        // global/class variables or fields are methods that exist outside of a
        // method and available to all the methods in that class.

        // Methods & // Varargs (treated)


//        int number = 7 + anotherMethod(5, 7, );

//        System.out.println(anotherMethod(12, 8, "g"));

        Main main = new Main();

        // 12, 34, 22, 55
//        int[] array = {12, 34, 22, 55};
        System.out.println(main.sumMethod(12, 33, 12);

    }

    // The three dots signify that the number of parameters you want
    // to enter are unknown.
    public int sumMethod(int... someValues) {
        int sum = 0;

        for (int i = 0; i < someValues.length; i++) {
            sum += someValues[i];
        }
        return sum;
    }

//    public static double anotherMethod(double firstNumber, double secondNumber, String operator) {
//
//        switch (operator) {
//            case "+":
//                return firstNumber + secondNumber;
//            case "-":
//                return firstNumber - secondNumber;
//            case "*":
//                return firstNumber * secondNumber;
//            case "/":
//                return firstNumber / secondNumber;
//            default:
//                System.out.println("Please a valid operator");
//                return 0;
//        }
//
//    }
}
