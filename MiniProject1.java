import java.util.Scanner;
public class MiniProject1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Compound Interest Calculator
        double amount;
        double principal;
        int timescompounded;
        int years;
        double rate;
        System.out.print("principal amount: ");
        principal = scanner.nextDouble();
        System.out.print("the rate of interest (in %): ");
        rate = scanner.nextDouble()/100;
        System.out.print("the # of times interest is compounded per year: ");    //generally one in one year
        timescompounded = scanner.nextInt();
        System.out.print("the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1+rate/timescompounded , timescompounded * years);
        System.out.printf("the amount after %d years is $%,.2f" , years , amount);
        scanner.close();
    }
}