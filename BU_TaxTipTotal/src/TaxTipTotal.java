import java.util.Scanner;

/**
 *
 * this is the second java program for the first assignment
 *
 * modified by---> Bhuwan Upadhyaya
 * date----> 1/20/2024
 *
 *
 * This class prompts the user for the meal amount, calculates the tax and tip,
 * and displays each item along with the total of meal amount, tax, and tip.
 */
public class TaxTipTotal {    ////entry point for any java program. actual code goes inside the curly {}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double TAX_RATE = 0.085;  // 8.5% tax rate.
        final double TIP_RATE = 0.18;   // 18% tip rate.

        // Create an instance of the Scanner class.
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the amount for the meal: ");
        double mealAmount = keyboard.nextDouble();

        double tax = mealAmount * TAX_RATE; // Corrected tax calculation
        double tip = mealAmount * TIP_RATE; // Corrected tip calculation
        double total = mealAmount + tax + tip; // Corrected total calculation

        System.out.printf("Meal amount: $%,8.2f\n", mealAmount);
        System.out.printf("        Tax: $%,8.2f\n", tax);
        System.out.printf("        Tip: $%,8.2f\n", tip);
        System.out.println("             ---------");
        System.out.printf("      Total: $%,8.2f\n", total);
    }

}
