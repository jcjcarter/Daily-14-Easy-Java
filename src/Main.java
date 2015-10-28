import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        Integer[] integers = new Integer[8];

        /* Fill up the hash map.*/
        for (int i = 0; i < integers.length; i++) {
            integers[i] = i;
        }

        /* Perform the block swapping. */
        shuffleSwitch(integers, 3);

    }

    public static void shuffleSwitch(Integer[] integers, int k) {

        ArrayList<Integer> integers1;

        /* Keep track of where you are located. */
        int index = 0;

        /* Keep up with index in the list. */
        int idx;

        while (k + index <= integers.length) {

            /* New position of the index. */
            idx = index;

            integers1 = new ArrayList<>();

            /* Copy all the elements from index to k + index to Arraylist*/
            integers1.addAll(Arrays.asList(integers).subList(index, k + index));

        /* Swap all the elements in the size. */
            for (int i = integers1.size() - 1; i >= 0; i--) {

                integers[idx] = integers1.get(i);

                /* Move up the index for integers array. */
                idx++;
            }

            /* Move up the index. */
            index += k;
        }

        /* Print out the results. */
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }


}
