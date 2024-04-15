package org.example;
import java.util.Scanner;

    public class Main {
        private static double balance = 0;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while (running) {
                System.out.println("Welcome to the Terminal Banking System");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        withdraw(withdrawAmount);
                        break;
                    case 4:
                        running = false;
                        System.out.println("Thank you for using the Terminal Banking System");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
            scanner.close();
        }

        private static void checkBalance() {
            System.out.println("Your current balance is: $" + balance);
        }

        private static void deposit(double amount) {
            balance += amount;
            System.out.println("Deposit successful. Your new balance is: $" + balance);
        }

        private static void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient funds. Withdrawal failed.");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. Your new balance is: $" + balance);
            }
        }
    }
