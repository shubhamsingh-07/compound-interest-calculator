import java.util.Scanner;
// AREA OF RECTANGLE

public class Main2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the width: ");
    Double width = scanner.nextDouble();
    System.out.print("Enter the height: ");
    Double height = scanner.nextDouble();
    Double area = width * height;
    System.out.print("area: " + area + " cm^2");
    scanner.close();
    }
}
