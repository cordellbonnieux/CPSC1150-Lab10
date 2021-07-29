/**
 * This program generates an array of integers of length 20 then sorts the array
 * using merge sort. 
 * @author (modified by) Cordell Bonnieux
 * @since 26 July 2021
 */
public class MergeSort{
    public static void main(String[] args) {

        int [] list1 = genArray(20);
        printArray("The array before merge sort: ", list1);
        mergeSort(list1);
        printArray("The array After merge sort: ", list1);
    }

    /**
     * A recursive method which continously splits an array in half, then merges it back together, in order.
     * @param list an array of integers
     */
    public static void mergeSort(int [] list){

        if (list.length > 1 ){

            int mid = list.length / 2 ;

            int [] firstHalf = new int[mid];
            copyArray(list, firstHalf, 0, mid);
            mergeSort(firstHalf); //sorts firstHalf in ascending order by recursion

            int [] secondHalf = new int[list.length - mid];
            copyArray(list, secondHalf, mid, list.length);
            mergeSort(secondHalf); //sorts secondHalf in ascending order by recursion

            // merges to lists ie. firstHalf and second half into a sorted list
            merge(firstHalf, secondHalf, list);

        } //base case
    }

    /**
     * generates and returns an array of random numbers of the given size
     * @param size an integer 
     * @return a list with a length of size
     */
    public static int[] genArray(int size){

        int [] list = new int [size];

        for (int i = 0; i< size; ++i)
            list[i] = (int)(Math.random() * 100 );

        return list;
    }
    
    /**
     * prints an array followed by the header
     * @param header
     * @param arr
     */
    public static void printArray(String header, int [] arr) {
        System.out.println(header);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " " );

        System.out.println();
    }

    /**
     * copies from index start to index end of sourcels to destLs. End is exclusive
     * @param sourceLs the list to be copied from
     * @param destLs the list to copy to
     * @param start the starting index
     * @param end the ending index
     */
    public static void copyArray(int [] sourceLs, int[] destLs, int start, int end){
        for (int i = start; i< end ; i++)
            destLs[i-start] = sourceLs[i];
    }

    /**
     * This method merges two lists into one in ascending order
     * @param firstHalf an array of ints to be merged
     * @param secondHalf an array of ints to be merged
     * @param list an array that the other two arrays will be merge into
     */
    public static void merge(int[] firstHalf, int[] secondHalf, int[] list) {

        int countF = 0, countS = 0;

        for (int i = 0; i < list.length; i++)
            if (countF < firstHalf.length)
                if (countS >= secondHalf.length || firstHalf[countF] < secondHalf[countS])
                    list[i] = firstHalf[countF++];
                else
                    list[i] = secondHalf[countS++];
            else 
                list[i] = secondHalf[countS++];
    }
}