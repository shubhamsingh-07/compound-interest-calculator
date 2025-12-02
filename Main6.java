import java.util.Random;
public class Main6{
    public static void main(String[] args){
        Random random = new Random();
        /*
        int number;
        number = random.nextInt(1,7);
        System.out.print(number);
         */
        boolean isTail;
        isTail = random.nextBoolean();
        if(isTail){
            System.out.print("TAILS");
        }
        else{
            System.out.print("HEADS");
        }


    }
}