import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Addition or Subtraction? ");
        String option = scanner.nextLine();


        // number 1
        System.out.println("Number 1: ");
        double x = Double.valueOf(scanner.nextLine());
        // number 2
        System.out.println("Number 2: ");
        double y = Double.valueOf(scanner.nextLine());

        if (option.toLowerCase().equals("addition")) {
            System.out.println("Result: " + Add.add(x, y));
        } else if (option.toLowerCase().equals("subtraction")) {
            System.out.println("Result: " + Difference.subtract(x, y));
        }

    }
}
