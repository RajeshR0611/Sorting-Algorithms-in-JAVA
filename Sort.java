package com.rajesh;
import java.util.*;

public class Sort {
    public static void selectionSortAsec(int[] arr){
        for(int i=0;i< arr.length;i++){
            int min = arr[i];
            int minIndex = i;
            for(int j=i;j<arr.length;j++){  //j=i+1
                if(arr[j]<min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            //swapping
            int temp = arr[i];
            arr[i] = min;  //arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void selectionSortDesc(int[] arr){  //simple version
        for(int i=0;i< arr.length;i++){
         //   int max = arr[i];
            int maxIndex = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]>arr[maxIndex]){
                 //   arr[maxIndex]=arr[j];
                    maxIndex = j;
                }
            }
            int temp= arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    public static void BubbleSort(int[] arr){
        for(int i = 1;i< arr.length;i++){
            boolean sort = false;
            for(int j=0;j<arr.length-i;j++){
                int temp=0;
                if(arr[j]>arr[j+1]){
                    sort = true;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                if(!sort){
                    break;
                }

            }
        }
    }

    public static void InsertionSort(int[] arr){
        for(int i=1;i< arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
    }

    public static int[] MergeSort(int[] arr){
        //divide operation
        if(arr.length == 1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left = MergeSort( Arrays.copyOfRange(arr,0,mid));
        int[] right = MergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);

    }
    private static int[] merge(int[] first, int[] sec){
        int[] join = new int[first.length+ sec.length];
        int i=0,j=0,k=0;
        while(i< first.length && j< sec.length){
            if(first[i]<sec[j]){
                join[k] = first[i];
                k++;i++;
            }else{
                join[k++]=sec[j++];
            }
        }
        while(i< first.length){
            join[k++] = first[i++];
        }
        while(j<sec.length){
            join[k++] = sec[j++];
        }

        return join;

    }

    public static void MergeSortInplace(int[] arr,int start,int end){
        if(end-start==1){
            return;
        }
        int mid = (start+end)/2;
        MergeSortInplace(arr,start,mid);
        MergeSortInplace(arr,mid,end);

        mergeInPlace(arr,start,mid,end);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e){
        int[] join = new int[e-s];
        int i=s,j=m,k=0;
        while(i<m && j<e){
            if(arr[i]<arr[j]){
                join[k] = arr[i];
                k++;i++;
            }else{
                join[k++] = arr[j++];
            }
        }
        while(i<m){
            join[k++] = arr[i++];
        }
        while(j<e){
            join[k++] = arr[j++];
        }

        for(k=0;k<join.length;k++){
            arr[s+k] = join[k];
        }

    }
    public static void quickSort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int start = low;
        int end = high;
        int mid = (start+end)/2;
        int pivot = arr[mid];
        while(start<=end){
            while(arr[start] <pivot){
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }
            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;

            }
        }
        quickSort( arr,low,end);
        quickSort(arr,start,high);
    }

}
