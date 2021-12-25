import java.util.Scanner;

public class Account {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***Bank Account***");
        System.out.println("Enter the Debit Amount :");
        int debitAmount = scanner.nextInt();

        Account account = new Account();
        account.debit(debitAmount);
    }

    public void debit(int debitAmount) {
        int amount = 1000;

        if (debitAmount > amount) {
            System.out.println("Your Debit Amount is Greater then Available Amount");
        } else if (debitAmount == 0){
            System.out.println("Insert Minimum Amount 100Rs");
        }else {
            amount = amount - debitAmount;
            System.out.println("Your Amount is Debited from Account is "+debitAmount+" & Current Amount is "+amount);
        }

    }
}
