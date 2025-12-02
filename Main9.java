public class Main9{
    public static void main(String[] args){


        //printf = method of formatting output
        //printf( %[flag] [width] [.precision] [specifier-character] )

        //specifier-character
        String name = "Spongebob";
        int age = 30;
        char firstletter = 'S';
        double height = 60.345;
        boolean isEmployed = true;
        System.out.printf("name: %s" , name);
        System.out.printf("\nwhat is the age: %d" , age);
        System.out.printf("\nwhat is the starting letter : %c" , firstletter);
        System.out.printf("\nwhat is the height: %f" , height);
        System.out.printf("\nis he employed: %b" , isEmployed);

        //combining of specifiers
        System.out.printf("\n%s is a %d years old with a height of %f cm" , name , age , height);

    }
}