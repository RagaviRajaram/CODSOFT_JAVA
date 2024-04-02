import java.util.Scanner;

public class ATM {
    private static Scanner scanner = new Scanner(System.in);
    private static double balance = 1000; 
    
    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void checkBalance() {
        System.out.println("Your balance is: $" + balance);
    }

    private static void deposit() {
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else {
            balance += amount;
            System.out.println("Deposit successful. Your new balance is: $" + balance);
        }
    }

    private static void withdraw() {
        System.out.print("Enter amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid amount or insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Your new balance is: $" + balance);
        }
    }
}
