
public class Main {

    public static void main(String[] args) {

        // Creating First Bank Account
        BankAccount account1 = new BankAccount(101, "Rahul", 5000);

        // Creating Second Bank Account
        BankAccount account2 = new BankAccount(102, "Aman", 10000);

        // Operations on First Account
        System.out.println("----- Account 1 -----");

        account1.deposit(2000);
        account1.withdraw(1000);
        account1.checkBalance();

        // Operations on Second Account
        System.out.println("\n----- Account 2 -----");

        account2.deposit(3000);
        account2.withdraw(2000);
        account2.checkBalance();

        // Display Final Details
        System.out.println("\n----- Final Account Details -----");

        account1.displayDetails();

        System.out.println();

        account2.displayDetails();
    }
}
