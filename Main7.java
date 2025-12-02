import java.util.Scanner;
public class Main7{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Calculate Hypotenuse by Side A and Side B
        double a;
        double b;
        double c;
        System.out.print("length of side A: ");
        a = scanner.nextDouble();
        System.out.print("length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt((Math.pow(a , 2)) + (Math.pow(b , 2)));
        System.out.print("value of Hypotenuse: " + c );

        scanner.close();
    }
}