import java.util.Scanner;

public class BankInterest {
    public static void main(String[] args) {
        float rate =8;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount");
        double money = input.nextDouble();
        System.out.println("Enter Number of Months");
        int month = input.nextInt();
        double interest = 0;
        for (int i = 0; i < month; i++) {
            interest+= money*rate/1200*month;
        }
        System.out.println("Interest:" + interest);
    }
}
