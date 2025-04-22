import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{   
    public static void mergeSort(int[] arr, int low, int high)
    {   //Return Type will be void, since the change happens in Original Array.
        //Base Condition
        if(low>=high)
        {
            return;
        }
        int mid = (low+high)/2;
        // Or
        //int mid = low+(high-low)/2;
        
        //Call the function for left side.
        mergeSort(arr,low,mid);
        //call the funtion for right side.
        mergeSort(arr,mid+1,high);
        // Actual Merging of sorted subarray portions.
        //calling the merger function.
        Merge_2_Sorted_Array(arr,low,mid,high);
        // We are passing the Original array where the element position will be changed.
    }
    public static void Merge_2_Sorted_Array(int[] arr,int low, int mid, int high)
    {
        // temporary array to handle elements.
        int[] temp = new int[high-low+1]; // Size is important here.
        //[low...mid] and [mid+1...high]
        int left = low; //Left pointer
        int right = mid+1; //Right pointer
        int k=0; //Manage temp index.
        // Now, constructing temp sorted array.
        while(left <= mid && right <=high)
        {
            if(arr[left]<=arr[right])//if left element is minimum.
            {
                temp[k]=arr[left];
                left++;
                k++;
            }
            else
            {
                temp[k] = arr[right];
                right++;
                k++;
            }
        }
        while(left<=mid)
        {
            temp[k++] = arr[left++]; // Combined post-increment.
        }
        while(right<=high)
        {
            temp[k++] = arr[right++];
        }
        //Now it's time to take elements from temp array
        //And insert it into Original array position.
        for(int m=low;m<=high;m++)
        {
            arr[m] = temp[m-low];
            // m - low....{0-0,1-0,2-0,..high-low} == {0, 1, 2, 3, ....high}
            //till high is n-1, the last index.
            //Depending on the recursive calls made, low and high indexes vary.
        }
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
	    // Calling the merger function
	    mergeSort(arr,0,n-1);
	    
	    for(int j=0;j<n;j++)
	    {
	        System.out.print(arr[j]+" ");//Prints the sorted array.
	    }
	}
}
