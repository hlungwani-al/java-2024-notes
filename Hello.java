import java.util.Scanner;

class Mathematics {
    double addition(double num1, double num2) {
        return num1 + num2;
    }

    double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    double division(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
}

public class Hello {
    public static void main(String[] args) {
        System.out.println("Choose an operation:\n" +
                "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n");
        Scanner userInput = new Scanner(System.in);
        String operation = userInput.nextLine();

        int operationCount = Integer.parseInt(operation);

        if (operationCount < 1 || operationCount > 4) {
            System.out.println("Invalid operation. Please choose a valid option.");
            System.exit(1);
        } else {
            System.out.print("Enter the first number: ");
            String firstNumber = userInput.nextLine();

            System.out.print("Enter the second number: ");
            String secondNumber = userInput.nextLine();

            if (firstNumber.matches("[0-9]+(\\.[0-9]+)?") && secondNumber.matches("[0-9]+(\\.[0-9]+)?")) {

                double firstNumberDouble = Double.parseDouble(firstNumber);
                double secondNumberDouble = Double.parseDouble(secondNumber);
                userInput.close();

                Mathematics mathsObject = new Mathematics();
                if (operationCount == 1) {
                    System.out.print("The sum of " + firstNumber + " and " + secondNumber + " is "
                            + mathsObject.addition(firstNumberDouble, secondNumberDouble));
                } else if (operationCount == 2) {
                    System.out.print("The difference of " + firstNumber + " and " + secondNumber + " is "
                            + mathsObject.subtraction(firstNumberDouble, secondNumberDouble));
                } else if (operationCount == 3) {
                    System.out.print("The multiplication of " + firstNumber + " and " + secondNumber + " is "
                            + mathsObject.multiplication(firstNumberDouble, secondNumberDouble));
                } else {
                    System.out.print("The result of " + firstNumber + " divided by " + secondNumber + " is "
                            + mathsObject.division(firstNumberDouble, secondNumberDouble));
                }

            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                System.exit(1);
            }
        }

    }

}