public class Main10 {
    public static void main(String[] args) {
        //printf = method of formatting output
        //printf( %[flag] [width] [.precision] [specifier-character] )

        //.precision
        double price1 = 30.676;
        double price2 = 66.987;
        double price3 = 27.887;

        System.out.printf("what is first price: %.1f" , price1);
        System.out.printf("\nwhat is the second price: %.2f" , price2);
        System.out.printf("\nwhat is the third price: %.0f" , price3);

    }
}