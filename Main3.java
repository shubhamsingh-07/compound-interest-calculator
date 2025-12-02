import java.util.Scanner;
// MADLIBS GAME

public class Main3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String adjective2;
        String noun1;
        String noun2;
        String verb1;
        String verb2;


        System.out.print("Enter the adjective1: ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter the adjective2: ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter the noun1: ");
        noun1 = scanner.nextLine();
        System.out.print("Enter the noun2: ");
        noun2 = scanner.nextLine();
        System.out.print("Enter the verb1: ");
        verb1 = scanner.nextLine();
        System.out.print("Enter the verb2: ");
        verb2 = scanner.nextLine();





        System.out.println("\nI " + adjective1 +" a panther in a " + noun1 + ".");
        System.out.println("and suddenly " + verb1 +" towards me. ");
        System.out.println("for a moment, I panicked and decided to run.");
        System.out.println("just saw a " + noun2 + " and started " + verb2 +" the " + adjective2 +  ".");



        scanner.close();
    }
}
