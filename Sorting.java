
import java.util.Random;


/**
 *
 * @author Sam McAnelly
 */

public class Sorting {

    private static final int MAX_INPUT = 10;
    private static double input[];

    public static void main(String[] args){
        Random generator = new Random();
        double sortedList[];
        long endTime;
        long totalTime;
        long startTime;
        for(int i = 10; i <= MAX_INPUT; i *= 10 ) {
            input = null;
            input = new double[i];
            sortedList = new double[i];
            for (int j = 0; j < i; j++){
                input[j] = generator.nextInt(1001) / 1000.0;
            }
            
            /*
            System.out.println("Unsorted list: ");
            for (double d: input){
                System.out.println(d);
            }
            
            System.out.println("\n\n\n");
            */
             
            startTime = System.currentTimeMillis();
            sortedList = BubbleSort.sort(input);
            
            /*
            for (double d: sortedList){
                System.out.println(d);
            }
            */
            
            endTime = System.currentTimeMillis();
            totalTime = endTime - startTime;
            System.out.println("Time taken for " + i + " input numbers: " + totalTime + " milliseconds");
        }
    }
    


}