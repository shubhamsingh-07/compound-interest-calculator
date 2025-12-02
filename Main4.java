import java.util.Scanner;
//SHOPPING CART PROGRAM

public class Main4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        double total;

        System.out.print("what you want to buy: ");
        item = scanner.nextLine();
        System.out.print("how much price for each " + item + " : ");
        price = scanner.nextDouble();
        System.out.print("how much " + item +" you want: ");
        quantity = scanner.nextInt();
        System.out.print("the total price for " + quantity + " " + item + " is " );
        total = quantity * price;
        System.out.print(total + "$");


        scanner.close();
    }

}
