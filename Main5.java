import java.util.Scanner;
//If else statement : Performs a block of code, if the condition is met.
public class Main5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        //GROUP 1
        if(name.isEmpty()){
            System.out.println("Please enter your name: ");
        }
        else {
            System.out.println("Hi " + name + " 🤯");
        }

        int age;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        //GROUP 2
        if (age >= 60){
            System.out.println("you're a senior citizen👴");
        }
        else if (age >= 18){
            System.out.println("You're a adult👨");
        }
        else if(age == 0){
            System.out.println("You're a baby👶");
        }
        else if(age < 0){
            System.out.println("You're not born🤰");
        }
        else{
            System.out.println("You're a kid🧑");
        }

        boolean isStudent;
        System.out.print("Are you a Student(true/false): ");
        isStudent = scanner.nextBoolean();
        if(isStudent){
            System.out.println("You're a Student👨‍🎓");
        }
        else{
            System.out.println("You're not a Student🙅‍♂️");
        }


        scanner.close();
    }
}
