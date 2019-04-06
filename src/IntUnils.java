import java.util.Random;
import java.util.Scanner;

public class IntUnils {
    /*
    - статические методы
    3) Реализовать класс IntUtils
    сделать его конструктор приватным
    реализовать в этом классе статичесткие методы
    static int plus(int a, int b);
    static int minus(int a, int b);
    static int pow(int number, int pow); //возведение в степень
    static int getRandomInt(int minBound, int maxBount);
    - задание на повторение циклов*/

    private IntUnils() {
    }

    static int plus(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    static int minus(int firstNumber, int secondNumber) {
        int subtraction = firstNumber - secondNumber;
        return subtraction;
    }

    static int pow(int number, int pow) {
        int raisingToPow = 1;
        for (int i = 1; i <= pow; i++) {
            raisingToPow = raisingToPow * number;
        }
        return raisingToPow;
    }

    static int getRandomInt(int minBound, int maxBound) {
        Random random = new Random();
        int randomNumber = minBound + random.nextInt(maxBound - minBound + 1);
        return randomNumber;
    }

    static int getFirstNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        return firstNumber;
    }

    static int getSecondNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter second number or pow");
        int secondNumber = scanner.nextInt();
        return secondNumber;
    }
    /*4) пользователь вводит число с консоли
    определить сколько делителей без остатка имеет число (к примеру введено число 8 - количество делителей 1, 2, 4, 8)*/

    static void divisors(int number) {
        int count = 0;
        System.out.println("There are dividers of the number " + number + ":");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
                count = count + 1;
            }
        }
        System.out.println("Number " + number + " has " + count + " dividers");
    }
}