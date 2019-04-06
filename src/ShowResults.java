import java.util.Scanner;

public class ShowResults {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you need to do some arithmetic operation (yes / no)?");
        String answer = scanner.nextLine();

        if (answer.equals("Yes") || answer.equals("yes")) {
            System.out.println("What kind of arithmetic operation should I do " +
                    "(sum / subtraction / pow / get random number)?");
            String answer1 = scanner.nextLine();

            if (answer1.equals("Sum") || answer1.equals("sum")) {
                System.out.println("The sum of these numbers are " +
                        IntUnils.plus(IntUnils.getFirstNumber(), IntUnils.getSecondNumber()));

            } else if (answer1.equals("Subtraction") || answer1.equals("subtraction")) {
                System.out.println("The subtraction of these numbers are " +
                        IntUnils.minus(IntUnils.getFirstNumber(), IntUnils.getSecondNumber()));

            } else if (answer1.equals("Pow") || answer1.equals("pow")) {
                System.out.println("The raising to power of this number is " +
                        IntUnils.pow(IntUnils.getFirstNumber(), IntUnils.getSecondNumber()));

            } else if (answer1.equals("Get random number") || answer1.equals("get random number")) {
                System.out.println("Random number is " +
                        IntUnils.getRandomInt(IntUnils.getFirstNumber(), IntUnils.getSecondNumber()));
            }
        } else if (answer.equals("No") || answer.equals("no")) {
            System.out.println("I am a calculator! I can't help you anymore!");

        } else {
            System.out.println("Mistake! Go back and answer the questions correctly!");
        }

        System.out.println("Enter the number you want to analyze for the number of dividers:");
        int number = scanner.nextInt();
        IntUnils.divisors(number);
    }
}