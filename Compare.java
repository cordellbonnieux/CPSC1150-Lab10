public class Compare {
    public static void main (String[] args) {

        System.out.printf("\n%10s%-25s\n", " ", "Average Number of Comparisons");
        System.out.printf("%-10s%12s%20s\n", "n", "Linear Search", "Binary Search");
        System.out.println("-------------------------------------------");

        for (int size=10; size <1000000; size*=10) {

            int [] list = genArray(size); //generates an array of random
            //integers with the given size.

            for (int i = 0; i < size; i++)
            System.out.print(list[i] + ", "); //test


            // develop the code to find out the average comparisons for
            // searching a target in the list using linear search and binary search
            // To sort your data use Arrays.sort(list)

            //System.out.printf "%-10d%-20.2f%-20.2f\n", size, avgLnS, avgBS);
        }
    }
    /**
     * Generates an array of integers which is the size of the integer parameter.
     * @param size an integer which represents the size of the array to create
     * @return the array of size size
     */
    public static int[] genArray(int size) {

        int[] data = new int[size];

        for (int i = 0; i < data.length; i++)
            data[i] = 1 + (int)(Math.random() * 10);

        return data;
    }
}