public class Main11 {
    public static void main(String[] args) {
        //printf = method of formatting output
        //printf( %[flag] [width] [.precision] [specifier-character] )

        //flag ----> width
        //flag
        // + : output a plus
        // , : seperates the digits by thousand (eg. 10,000)
        // ( : encloses a number if negative. eg. (-54.56)
        // space : generates a space if it's positive , or else puts -ve if it's negative




        int cash1 = 445000;
        double cash2 = 33200.5578;
        int cash3 = -2500;

        System.out.printf("%+(,d", cash1);
        System.out.printf("\n%+(,.1f", cash2);
        System.out.printf("\n%+(,d", cash3);
        //use space only after clearing ( , and +
    }
}