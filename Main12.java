public class Main12 {
    public static void main(String[] args) {
        //printf = method of formatting output
        //printf( %[flag] [width] [.precision] [specifier-character] )

        //width
        // 0 = zero padding
        // number = right justified padding
        // -ve number = left justified padding

        int lottery1 = 1;
        int lottery2 = 23;
        int lottery3 = 456;
        int lottery4 = 7890;
        System.out.printf("\n%04d", lottery1);
        System.out.printf("\n%5d", lottery2);
        System.out.printf("\n%-4d", lottery3);
        System.out.printf("\n%5d", lottery4);




    }
}