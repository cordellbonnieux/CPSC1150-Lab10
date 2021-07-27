import java.util.*;
public class Compare {
    public static void main (String[] args) {

        System.out.printf("\n%10s%-25s\n", " ", "Average Number of Comparisons");
        System.out.printf("%-10s%12s%20s\n", "n", "Linear Search", "Binary Search");
        System.out.println("-------------------------------------------");

        for (int size=10; size <1000000; size*=10) {

            int [] list = genArray(size); 

            int num = randomSearch(list);

            int avgLnS = linearSearch(list, num);

            int avgBS = binarySearch(list, num);

            // develop the code to find out the average comparisons for
            // searching a target in the list using linear search and binary search

            System.out.printf("%-10d%-20.2f%-20.2f\n", size, avgLnS, avgBS);
        }
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

    public static int linearSearch(int[] data, int num) {

        return 0;
    }

    public static int binarySearch(int[] data, int num) {


        return 0;
    }

    /**
     * Selects a random int from an array
     * @param data an array of integers
     * @return an integer which matches one from the data array
     */
    public static int randomSearch(int[] data) {
        
        int random = 1 + (int)(Math.random() * 1000000);

        for (int i = 0; i < data.length; i++) {
            if (random == data[i])
                return random;
        }

        return randomSearch(data);
    }
}