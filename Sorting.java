
import java.util.Random;


/**
 *
 * @author Sam McAnelly
 * This program puts two well known sorting algorithms head to head in a competition to see which is fastest
 *
 * Bubble Sort: this sorting algorithm grows in complexity at a rate of O(n^2) which means that the time to 
 * sort grows exponentially based on the input number (n)
 *
 * Merge Sort: this algorithm is much faster than bubble sort and only grows in complexity by O(nlogn) which
 * is extremely fast. The only downfall of merge sort is that it uses much more memory than bubble sort
 */

public class Sorting {

    private static long MAX_INPUT = 1000000000000l;
    private static double input[];

    public static void main(String[] args){
        boolean BubbleFinished = false;
        boolean MergeFinished = false;
        boolean outOfMemory = false;
        
        //Testing Code
        /*
        if (args != null)
            MAX_INPUT = Integer.parseInt(args[0]);
         */
        //Testing Code
        
        Random generator = new Random();
        double sortedList[];
        long endTime;
        long totalTime;
        long startTime;
        for(int i = 10; i <= MAX_INPUT; i *= 10 ) {
            input = null;
            try {
                input = new double[i];
                sortedList = new double[i];
                for (int j = 0; j < i; j++){
                    input[j] = generator.nextInt(1001) / 1000.0;
                }
            } catch (OutOfMemoryError e) {
                System.out.println("*****************************");
                System.out.println("Out of Memory!");
                System.out.println("*****************************");
                return;
            }
            /*
            System.out.println("Unsorted list: ");
            for (double d: input){
                System.out.println(d);
            }
            
            System.out.println("\n\n\n");
            */
            
            /*
             for (double d: sortedList){
             System.out.println(d);;
             }
             */
            
            if (!BubbleFinished) {
                try {
                    startTime = System.currentTimeMillis();
                    BubbleSort.sort(input);
                    endTime = System.currentTimeMillis();
                    totalTime = endTime - startTime;
                    System.out.println("Bubble Sort: Time taken for " + i + " input numbers: " + totalTime + " milliseconds");
                } catch (Exception e) {
                    BubbleFinished = true;
                    System.out.println(e);
                }
            }
            
            if (!MergeFinished) {
                try {
                    startTime = System.currentTimeMillis();
                    MergeSort.sort(input);
                    endTime = System.currentTimeMillis();
                    totalTime = endTime - startTime;
                    System.out.println("Merge Sort:  Time taken for " + i + " input numbers: " + totalTime + " milliseconds");
                    
                } catch (Exception e) {
                    MergeFinished = true;
                    System.out.println(e);
                }
            }
        }
    }
}