import java.util.Scanner;                                // package + class

public class Main1 {

    public static void main(String[] args){                           /* each and everthing should  be in static class
                                                                        i.e., var values won't change */

        Scanner scanner = new Scanner(System.in);                      /* scanner = object, that will take input*/

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();                               // scanner is not defined now, it should be defined 'static variable' i.e., String or something
                                                                        // nextLine(); = takes input as a line,not as a word
        System.out.print("what's your age: ");
        int age = scanner.nextInt();

        System.out.print("what is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("are you a student (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("hello " + name + " how's you?");

        if(isStudent){
            System.out.print("you're enrolled as a student !");
        }
        else{
            System.out.print("you're not enrolled !");
        }

        scanner.close();
        // close the input reciever (scanner) or else func. won't stop

    }
}
