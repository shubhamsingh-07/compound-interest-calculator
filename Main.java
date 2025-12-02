public class Main {
    public static void main(String[] args) {


        System.out.println("my name is shue");

        String name = "bro code";
        int gta = 6;
        char gender = 'M';
        double pi = 3.14;
        boolean isAdmin = true;
        if(isAdmin) {
            System.out.println("authentication passed: " + name + " (login successful)");
            System.out.println("user game selected: " + gta);
            System.out.println("M/F gender : " + gender);
            System.out.println("your lucky number: " + pi);
        }
        else{
                System.out.println("authentication failed: " + name + " (not found)");
        }

    }
}
