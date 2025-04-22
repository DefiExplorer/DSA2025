import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{   
    public static void quickSort(int[] arr, int low, int high)
    {
        if(low<high)
        {
            int partition_index = partition(arr,low,high);
            quickSort(arr,low,partition_index-1); //Left Portion
            quickSort(arr,partition_index+1,high); //Right Portion
        }
    }
    public static int partition(int[] arr,int low, int high)
    {
        int pivot = arr[low];
        int i = low; //left index
        int j = high; //right index
        while(i<j)
        {   // Condition for i++
            while(arr[i]<=pivot && i<=high-1)
            {
                i++;
            }
            //Condition for j--
            while(arr[j]>pivot && j>=low)
            {
                j--;
            }
            //Now check and swap ith element with jth element.
            //Since ith will be > pivot and j<pivot, if exists.
            //Or swap until i and j crossed each other.
            if(i<j)//or we can say: arr[j]<pivot && arr[i]>pivot
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // At end we just have to move the pivot to jth position when j becomes <= i.
        arr[low] = arr[j];
        arr[j] = pivot;
        //Since pivot already holds the value, we don't need temp var for swap.
        return j; // j will hold our partion_index
    }

	public static void main (String[] args) throws java.lang.Exception
	{   
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt(); // Given Array Size
	    int[] arr = new int[n];
	    for(int i=0; i<n;i++)
	    {
	        arr[i] = scn.nextInt();
	    }
	    //low = 0 and high = n-1 (indexes)
	    
	    quickSort(arr,0,n-1);
	    
	    for(int j=0;j<n;j++)
	    {
	        System.out.print(arr[j]+" ");//Prints the sorted array.
	    }
	}
}
