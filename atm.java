import java.util.Scanner;

public class atm {
    int PIN = 1234;
    float Balance;

    public void CheckPin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Pin");
        int v = sc.nextInt();
        if (v == PIN) {
            menu(sc);
        } else {
            System.err.print("Invalid Pin");
        }
    }

    public void menu(Scanner sc) {
        System.out.println("1. Check Balance");
        System.out.println("2. Cash Withdrawal");
        System.out.println("3. Cash Deposit");
        System.out.println("4. Exit");
        int v = sc.nextInt();
        
        if (v == 1) {
            Checkbalance(sc);
        } else if (v == 2) {
            cashwithdrawal(sc);
        } else if (v == 3) {
            Cashdeposit(sc);
        } else if (v == 4) {
            Exit();
        } else {
            System.out.println("Enter a Valid choice");
            menu(sc);
        }
    }

    public void Checkbalance(Scanner sc) {
        System.out.println("Your Balance is: " + Balance);
        menu(sc);
    }

    public void cashwithdrawal(Scanner sc) {
        System.out.print("Enter your Amount: ");
        float amount = sc.nextFloat();
        
        if (amount <= Balance) {
            Balance = Balance - amount;
            System.out.println("Withdrawal successful. Remaining balance: " + Balance);
        } else {
            System.out.println("Insufficient balance.");
        }
        
        menu(sc);
    }

    public void Cashdeposit(Scanner sc) {
        System.out.print("Enter your Amount: ");
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Deposit successful. New balance: " + Balance);
        menu(sc);
    }

    public void Exit() {
        System.out.println("Thank you for using the ATM. Goodbye!");
    }
}
