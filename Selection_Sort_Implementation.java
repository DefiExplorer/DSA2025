import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{  
    public static int[] selectionsort(int[] arr)
    {
        int i=0;
        int n=0;
        
        for(int j=0;j<arr.length-1;j++)
        {   
            // Finding the minimum element
            int min=Integer.MAX_VALUE;
            int index_found=0;
            while(i<arr.length)
            {
                if(arr[i]<min)
                {
                    min = arr[i];
                    index_found=i;
                }
                i++;
            }
            // Swapping the index and adjusting the variables.
            int temp = arr[j];
            arr[index_found] = temp;
            arr[j]=min;
            n++;
            i=n;
            
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
	    int[] sorted = selectionsort(arr);
	    // Prints the sorted Array
	    for(int i =0; i<n;i++)
	    {
	        System.out.print(sorted[i]+ " ");
	    }
	}
}
