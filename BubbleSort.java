
/**
 *
 * @author Sam McAnelly
 */

public class BubbleSort {
    public static void main(String[] args){

    }

    public static double[] sort(double[] arr) throws Exception{
        long startTime = System.currentTimeMillis();
        long endTime;
        double temp;
        boolean switched;
        for (int i = 0; i < arr.length; i++){
            switched = false;
            for (int j = arr.length - 1; j >= i + 1; j--){
                endTime = System.currentTimeMillis();
                if ((endTime - startTime) >= 20000)
                    throw new Exception("Bubble Sort: Time has exceeded 20 seconds.");
                if (arr[j] < arr[j - 1]){
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    switched = true;
                }
            }
            if (!switched){
                break;
            }
        }
        return arr;
    }

    
    //Same sorting algorithm, but used for integer arrays
    public static int[] sort(int[] arr){
        int temp;
        boolean switched;
        for (int i = 0; i < arr.length; i++){
            switched = false;
            for (int j = arr.length; j >= i + 1; j--){
                if (arr[j] < arr[j - 1]){
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    switched = true;
                }
            }
            if (!switched){
                break;
            }
        }
        return arr;
    }
    
}