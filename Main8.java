import java.util.Scanner;
public class Main8{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Volume of Circle

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        System.out.print("Value of circumference: " + circumference + " cm");

        area = Math.PI * Math.pow(radius , 2);
        System.out.print("\n Value of area: " + area + " cm^2");

        volume = (3.0 / 4.0) * Math.PI * Math.pow(radius , 3);         //numerical value must be in double, if written
        System.out.print("\nValue of Volume: " + volume + " cm^3");
        scanner.close();

    }
}