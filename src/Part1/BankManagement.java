package Part1;

import java.util.LinkedList;
import java.util.Scanner;

public class BankManagement {
    public static void main(String[] args) {
        LinkedList<BankAccount> accounts = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Bank Management System ---");
            System.out.println("1. Add Account");
            System.out.println("2. Display All Accounts");
            System.out.println("3. Search by Username");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNum = scanner.nextLine();
                    System.out.print("Enter Username: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Balance: ");
                    double bal = scanner.nextDouble();

                    accounts.add(new BankAccount(accNum, name, bal));
                    System.out.println("Account added successfully!");
                    break;

                case 2:
                    System.out.println("\nAccounts List:");
                    for (int i = 0; i < accounts.size(); i++) {
                        System.out.println((i + 1) + ". " + accounts.get(i));
                    }
                    break;

                case 3:
                    System.out.print("Enter username to search: ");
                    String searchName = scanner.nextLine();
                    boolean found = false;
                    for (BankAccount acc : accounts) {
                        if (acc.username.equalsIgnoreCase(searchName)) {
                            System.out.println("Found: Account [" + acc.accountNumber + "] - Balance: " + acc.balance);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Account not found.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}
