import java.util.*;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double usdToInr = 83.0;
        double eurToInr = 90.5;

        System.out.println("Select base currency: ");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        int base = sc.nextInt();

        System.out.println("Enter amount: ");
        double amount = sc.nextDouble();

        double inrAmount = 0;
        if (base == 1) {
            inrAmount = amount * usdToInr;
            System.out.println(amount + " USD = " + inrAmount + " INR");
        } else if (base == 2) {
            inrAmount = amount * eurToInr;
            System.out.println(amount + " EUR = " + inrAmount + " INR");
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}

