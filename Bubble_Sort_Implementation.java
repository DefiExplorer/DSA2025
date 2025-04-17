import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{  
    public static int[] bubblesort(int[] arr)
    {
        int len = arr.length;
        int j=0;
        while(j<arr.length)
        {
        for(int i=0;i<len-j-1;i++)
        {   
            // Finding the maximum element
            if(arr[i]>arr[i+1])
            {
            // Swapping the index and adjusting the variables.
            int min = arr[i+1]; //min of 2 stored on left
            arr[i+1] = arr[i]; 
            arr[i]=min;
            }
        }
        j++;   
        }
        return arr;
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{   
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt(); // n is the size of Array
	    
	    int[] arr = new int[n];
	    //Takes Array inputs
	    for(int i=0;i<n;i++)
	    {
	        arr[i] = scn.nextInt();
	    }
	    int[] sorted = bubblesort(arr);
	    // Prints the sorted Array
	    for(int i =0; i<n;i++)
	    {
	        System.out.print(sorted[i]+ " ");
	    }
	}
}
