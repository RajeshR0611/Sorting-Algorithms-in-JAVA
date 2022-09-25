package com.rajesh;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {9,3,5,4,1,6,2,99,7};

        //Sorting the given array in ascending order using Selection Sort
        Sort.selectionSortAsec(arr);
        System.out.println(Arrays.toString(arr));

        Sort.selectionSortDesc(arr); //Sorting the given array in descending order using Selection Sort
        System.out.println(Arrays.toString(arr));

        Sort.BubbleSort(arr); //Sorting the given array using Bubble Sort
        System.out.println(Arrays.toString(arr));

        Sort.InsertionSort(arr);  //Sorting the given array using Insertion Sort
        System.out.println(Arrays.toString(arr));

        int[] merge = Sort.MergeSort(arr); //Sorting the given array using Merge Sort
        System.out.println(Arrays.toString(merge));

        Sort.MergeSortInplace(arr,0, arr.length); //Sorting the given array using Merge Sort efficiently
        System.out.println(Arrays.toString(arr));


        Sort.quickSort(arr,0, arr.length-1); ////Sorting the given array using Quick Sort
        System.out.println(Arrays.toString(arr));

    }
}
