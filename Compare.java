import java.util.*;
public class Compare {
    public static void main (String[] args) {

        System.out.printf("\n%10s%-25s\n", " ", "Average Number of Comparisons");
        System.out.printf("%-10s%12s%20s\n", "n", "Linear Search", "Binary Search");
        System.out.println("-------------------------------------------");

        for (int size=10; size <1000000; size*=10) {

            int[] list = genArray(size); 

            int num = list[(int)(Math.random() * list.length)];

            int linear = linearSearch(list, num);

            int binary = binarySearch(list, num); 

            //System.out.printf("%-10d%-20.2f%-20.2f\n", size, avgLnS, avgBS);
        }
        System.out.println("done");
        System.exit(0);
    }
    /**
     * Generates a sorted array of integers (from one to one million) which is the size of the integer parameter.
     * @param size an integer which represents the size of the array to create
     * @return the array of size size
     */
    public static int[] genArray(int size) {

        int[] data = new int[size];

        for (int i = 0; i < data.length; i++)
            data[i] = 1 + (int)(Math.random() * 1000000);
        
        Arrays.sort(data);

        return data;
    }

    /**
     * Performs a linear search on data for num, and returns the number of comparrisons
     * @param data array of integers
     * @param num an integer to search for 
     * @return an integer representing the number of comparrisons 
     */
    public static int linearSearch(int[] data, int num) {

        int counter = 0;

        for (int i = 0; i < data.length; i++)
            if (data[i] == num)
                return counter++;
            else
                counter++;
        
        return counter;
    }

    /**
     * Performs a binary search on data for num, return the number of comparrisons
     * @param data an array of integers
     * @param num an interger to search for
     * @return an integer representing the number of comparrisons
     */
    public static int binarySearch(int[] data, int num) {

        int counter = 0,
            mid = (data.length - 1) / 2,
            last = data.length - 1,
            first = 0;

        while (first <= last) {
            if (data[mid] < num) {
                counter++;
                first = mid + 1;
            
            } else if (data[mid] == num) {
                counter++;
                break;

            } else {
                counter++;
                last = mid - 1;

            }
            mid = (first + last) / 2;
        }
            
        return counter;
    }
}