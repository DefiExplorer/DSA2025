import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{  
    public static int[] insertionsort(int[] arr)
    {
        int len = arr.length;
        
        for(int j=1;j<len;j++)
        {
        int i = j;    
        while(i>0)
        {   
            
            if(arr[i-1]>arr[i])
            {   
                int temp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=temp;
            }
            else
            {
                break; //If no more swap happens.
            }
            i--;
        }
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
	    int[] sorted = insertionsort(arr);
	    // Prints the sorted Array
	    for(int i =0; i<n;i++)
	    {
	        System.out.print(sorted[i]+ " ");
	    }
	}
}
