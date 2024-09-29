import java.util.Scanner;
public class CreditCard {
    public static void main(String[] args) {
        double balance = 5000;
        System.out.print("Balance before interest: ");
        System.out.printf("$%.2f", balance);
        System.out.println();
        balance = balance + balance * .17;
        System.out.print("Balance after one month: ");
        System.out.printf("$%.2f", balance);
        System.out.println();
        balance = balance + balance * .17;
        System.out.print("Balance after two months: ");
        System.out.printf("$%.2f", balance);
        System.out.println();
        balance = balance + balance * .17;
        System.out.print("Balance after three months: ");
        System.out.printf("$%.2f", balance);
        System.out.println();
    }
}
