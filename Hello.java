import java.util.Scanner;

class Mathematics {
    double addition(double num1, double num2) {
        return num1 + num2;
    }
}

public class Hello {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String firstNumber = userInput.nextLine();

        System.out.print("Enter the second number: ");
        String secondNumber = userInput.nextLine();

        if (firstNumber.matches("[0-9]+(\\.[0-9]+)?") && secondNumber.matches("[0-9]+(\\.[0-9]+)?")) {

            double firstNumberDouble = Double.parseDouble(firstNumber);
            double secondNumberDouble = Double.parseDouble(secondNumber);
            userInput.close();
            Mathematics mathsObject = new Mathematics();

            System.out.print("The sum of " + firstNumber + " and " + secondNumber + " is "
                    + mathsObject.addition(firstNumberDouble, secondNumberDouble));

        } else {
            System.out.println("Invalid input. Please enter a valid number.");
            System.exit(1);
        }

    }

}