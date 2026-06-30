import java.util.*;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bal = 10000;
        System.out.print("Enter your 4 digit PIN: ");
        int pin = sc.nextInt();
        int choice;
        if (pin != 1234) {
            System.out.println("Invalid PIN");
            return;
        }
        else{
            System.out.println("Welcome");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            do {
            System.out.println("Enter your choice (1/2/3/4):");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Current Balance: " + bal);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    int wid = sc.nextInt();
                    if (wid <= bal && wid % 100 == 0) {
                        bal -= wid;
                        System.out.println("Withdrawal Successful");
                    }
                    else{
            if(wid<=bal){
            System.out.println("Insufficient Balance");}
            else if(wid%100!=0){
              System.out.println("Please enter valid amount");}
          }
                    break;
                case 3:
                    System.out.print("Enter deposit amount: ");
                    int dep = sc.nextInt();
                    bal += dep;
                    System.out.println("Deposit Successful");
                    break;
                case 4:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 4);
        }
    }
}