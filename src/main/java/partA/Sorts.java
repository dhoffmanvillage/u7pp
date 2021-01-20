package partA;

import java.util.List;
import java.util.ArrayList;

public class Sorts {

    /**
     * Sorts the array in ascending using a selection sort
     * @param array an int array to be sorted. not affected by the method
     * @return a copy of the array sorted in ascending ordfer
     */
    public static int[] selectionSort(int[] array) {
        int[] retArr = copyArray(array);

        for(int i = 0; i < retArr.length; i++) {
            int minIndex = findMinIndex(retArr, i);
            Sorts.arraySwap(retArr, minIndex, i);
        }

        return retArr;
    }

    /**
     * Sorts list in descending order using a selection sort
     * @param list a list of numbers to sort. unchanged by the method
     * @return a new List with the values from list sorted in descending order
     */
    public static List<Integer> selectionSort(List<Integer> list) {
        List<Integer> retList = new ArrayList<Integer>(list);

        for(int i = 0; i < retList.size(); i++) {
            int maxIndex = Sorts.findMaxIndex(retList, i);
            Sorts.listSwap(retList, maxIndex, i);
        }

        return retList;
    }
    
    /**
     * Sorts the array in ascending order using an insertion sort
     * @param array an int array to be sorted. not affected by the method
     * @return a copy of the array sorted in ascending order
     */
    public static int[] insertionSort(int[] array) {
        int[] retArr = copyArray(array);

        for(int i = 1; i < array.length; i++) {
            int key = retArr[i];
            Sorts.arrayShift(retArr, key, i - 1);
        }

        return retArr;
    } 
    
    /**
     * Sorts list in descending order using an insertion sort
     * @param list a list of numbers to sort. unchanged by the method
     * @return a new List with the values from list sorted in descending order
     */
    public static List<Integer> insertionSort(List<Integer> list) {
        List<Integer> retList = new ArrayList<Integer>(list);

        for(int i = 0; i < retList.size(); i++) {
            int key = retList.get(i);
            Sorts.listShift(retList, key, i - 1);
        }

        return retList;
    }
    
    /**
     * Creates and returns a copy of the parameter
     * @param array the array to be copied
     * @return a new copy of array
     */
    private static int[] copyArray(int[] array) {
        int[] retArr = new int[array.length];

        for(int i = 0; i < retArr.length; i++)
            retArr[i] = array[i];

        return retArr;
    }

    /**
     * Finds the index of the smallest elements in array that occurs [startingIndex, array.length)
     * @param array the array to examine
     * @param startingIndex a valid index in array to start the search from
     * @return the index in the array that is the smallest element between [startingIndex, array.length)
     */
    private static int findMinIndex(int[] array, int startingIndex) {
        int minIndex = startingIndex;

        for(int i = startingIndex + 1; i < array.length; i++) {
            if(array[minIndex] > array[i])
                minIndex = i;
        }

        return minIndex;
    }

    /**
     * Finds the index of the largest element in list that occurs [startingIndex, list.size))
     * @param list the list to examine
     * @param startingIndex a valid index in list to start the search from
     * @return the index in the list that is the largest element between [startingIndex, list.size)
     */
    private static int findMaxIndex(List<Integer> list, int startingIndex) {
        int maxIndex = startingIndex;

        for(int i = startingIndex + 1; i < list.size(); i++) {
            if(list.get(maxIndex) < list.get(i))
                maxIndex = i;
        }

        return maxIndex;
    }

    /**
     * Swaps the elements in the array
     * @param array the array to swap elements in
     * @param index the index of the first element to swap
     * @param otherIndex the index of the second element to swap
     */
    private static void arraySwap(int[] array, int index, int otherIndex) {
        int temp = array[index];
        array[index] = array[otherIndex];
        array[otherIndex] = temp;
    }

    /**
     * Swaps two elements in a list
     * @param list the list to swap elements in
     * @param index the index of the first element to swap
     * @param otherIndex the index of the second element to swap
     */
    private static void listSwap(List<Integer> list, int index, int otherIndex) {
        int temp = list.get(index);
        list.set(index, list.get(otherIndex));
        list.set(otherIndex, temp);
    }

    /**
     * Shifts elements over based on the key for an insertion sort
     * @param array the array to shift elements in
     * @param key the key value to shift based on
     * @param j the location to start shifting
     */
    private static void arrayShift(int[] array, int key, int j) {
        while(j >= 0 && array[j] > key) {
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = key;
    }

    /**
     * Shifts elements over based on the key for an insertion sort
     * @param array the array to shift elements in
     * @param key the key value to shift based on
     * @param j the location to start shifting
     */
    private static void listShift(List<Integer> list, int key, int j) {
        while(j >= 0 && list.get(j) < key) {
            
            list.set(j + 1, list.get(j));
            j--;
        }

        list.set(j + 1, key);
    }
}