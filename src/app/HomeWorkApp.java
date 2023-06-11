package app;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
        System.out.println(checks(7, 5));
        System.out.println();
        printPositiveOrNegative(0);
        System.out.println(printBoolean(-3));
        System.out.println();
        specifiedNTimes(4,"Hi!!!");
        System.out.println();
        System.out.println(whatYear(2023));
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println();
    }

    private static void checkSumSing() {
        int a = 5;
        int b = 7;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("The amount is positive!");
            System.out.println();
        } else {
            System.out.println("The amount is negative!");
            System.out.println();
        }

    }

    private static void printColor() {
        int value = 77;

        if (value <= 0) {
            System.out.println("Red");
            System.out.println();
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
            System.out.println();
        } else {
            System.out.println("Green");
            System.out.println();
        }
    }

    private static void compareNumbers() {
        int a = 63;
        int b = 7;
        if (a >= b) {
            System.out.println("a >= b");
            System.out.println();
        } else {
            System.out.println("a < b");
            System.out.println();
        }
    }

    private static boolean checks(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    private static void printPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("A positive number");
            System.out.println();
        } else {
            System.out.println("A negative number");
            System.out.println();
        }
    }

    private static boolean printBoolean(int num){
        if (num >= 0) {
          return false;
        } else {
            return true;
        }
    }
    private static void specifiedNTimes(int r, String text) {
        for (int i = 0; i < r; i++) {
            System.out.println(text);
        }
    }
    private static boolean whatYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}