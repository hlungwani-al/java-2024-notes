import java.util.Scanner;

class Predicate {
    int testMarks(byte mark1, byte mark2, byte mark3) {
        return mark1 + mark2 + mark3;
    }

    int semesterMarks(byte mark1, byte mark2) {
        return mark1 + mark2;
    }

    void predicateCalculator() {
        Scanner markScanner = new Scanner(System.in);

        System.out.println("Please enter the first test mark: ");
        byte a = markScanner.nextByte();

        System.out.println("Please enter the second test mark: ");
        byte b = markScanner.nextByte();

        System.out.println("Please enter the third test mark: ");
        byte c = markScanner.nextByte();

        System.out.println("Please enter the first semester mark: ");
        byte d = markScanner.nextByte();

        System.out.println("Please enter the second semester mark: ");
        byte e = markScanner.nextByte();

        double predicate = (testMarks(a, b, c) * 0.1) + (semesterMarks(d, e) * 0.35);

        System.out.println("Your predicate is: " + predicate);

        markScanner.close();
    }
}

public class Exercise {
    public static void main(String[] args) {
        Predicate predicateObject = new Predicate();
        predicateObject.predicateCalculator();
    }
}