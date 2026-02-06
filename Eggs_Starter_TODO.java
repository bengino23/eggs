import java.util.Scanner;

/*
Module 3 In-Class Activity: METHODS PRACTICE
Program: Eggs.java

Scenario:
Meadowdale Dairy Farm sells organic brown eggs.
- $3.25 per dozen
- $0.45 per loose egg (not part of a dozen)
*/

public class Eggs {

    // TODO 1: Constants for prices
    public static final double PRICE_PER_DOZEN = 3.25;
    public static final double PRICE_PER_LOOSE_EGG = 0.45;

    // TODO 2: Calculate full dozens
    public static int calculateDozens(int eggs) {
        return eggs / 12;
    }

    // TODO 3: Calculate loose eggs
    public static int calculateLooseEggs(int eggs) {
        return eggs % 12;
    }

    // TODO 4: Calculate total cost
    public static double calculateTotalCost(int dozens, int looseEggs) {
        return (dozens * PRICE_PER_DOZEN) + (looseEggs * PRICE_PER_LOOSE_EGG);
    }

    // TODO 5: Build explanation string
    public static String buildExplanation(int eggs, int dozens, int looseEggs, double total) {
        return "You ordered " + eggs + " eggs. That’s " +
                dozens + " dozen at $" + PRICE_PER_DOZEN +
                " per dozen and " + looseEggs +
                " loose eggs at $" + PRICE_PER_LOOSE_EGG +
                " each for a total of $" +
                String.format("%.2f", total) + ".";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of eggs in the order: ");
        int eggs = input.nextInt();

        // TODO 6: Validate input
        if (eggs < 0) {
            System.out.println("Error: Number of eggs cannot be negative.");
            input.close();
            return;
        }

        // TODO 7: Method calls
        int dozens = calculateDozens(eggs);
        int looseEggs = calculateLooseEggs(eggs);
        double totalCost = calculateTotalCost(dozens, looseEggs);
        String explanation = buildExplanation(eggs, dozens, looseEggs, totalCost);

        // TODO 8: Print explanation
        System.out.println(explanation);

        input.close();
    }
}
