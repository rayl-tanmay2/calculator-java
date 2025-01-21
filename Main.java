//Name: Tanmay Joshi
//PRN: 23070126134
//Batch: AIML B3

// Main.java

import java.util.*;
class Main{
	public static void main(String[] args) {
        Calculator calculator = new Calculator();
        UserInput userInput = new UserInput();
    
        // Display menu and prompt user for operation selection
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an operation:");
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Fibonacci\n6. Sum of Array\n7. Mean of Array");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                int[] numbers = userInput.getTwoNumbers();
                System.out.println("Sum: " + calculator.add(numbers));
            }
            case 2 -> {
                int[] numbers = userInput.getTwoNumbers();
                System.out.println("Difference: " + calculator.subtract(numbers));
            }
            case 3 -> {
                int[] numbers = userInput.getTwoNumbers();
                System.out.println("Product: " + calculator.multiply(numbers));
            }
            case 4 -> {
                int[] numbers = userInput.getTwoNumbers();
                System.out.println("Quotient: " + calculator.divide(numbers));
            }
	    case 5 -> {
                System.out.println("Enter a number for Fibonacci sequence:");
                int NUM = scanner.nextInt();
                System.out.println("Fibonacci of " + NUM + ": " + calculator.fibonacci(NUM));
            }
            case 6 -> {
                int[] array = userInput.getArray();
                System.out.println("Sum of Array: " + calculator.sumArray(array));
            }
            case 7 -> {
                int[] array = userInput.getArray();
                System.out.println("Mean of Array: " + calculator.meanArray(array));
            }
            default -> System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}
