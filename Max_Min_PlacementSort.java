import java.util.*;
// This is my own Algorithm for sorting. I call it ExtremaPlacementSort or MinMaxPlacementSort.
// It ranks at 3rd Position after merge sort and heap sort as per the comparisons.
// Feel Free to suggest anything or try it out yourself!
public class ExtremaPlacementSort {

    public static List<Integer> extremaPlacementSortWithHeaps(int[] arr) {
        int n = arr.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Min-heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // Max-heap
        List<Integer> sortedList = new LinkedList<>();

        // Build the heaps (O(n log n))
        for (int x : arr) {
            minHeap.add(x);
            maxHeap.add(x);
        }

        for (int i = 0; i < n / 2; i++) {
            int minVal = minHeap.poll(); // O(log n)
            int maxVal = maxHeap.poll(); // O(log n)

            sortedList.add(0, minVal); // Add to beginning of LinkedList (O(1))
            sortedList.add(maxVal); // Add to end of LinkedList (O(1))
        }

        // Handle the middle element (if the array has an odd number of elements)
        if (n % 2 != 0) {
            sortedList.add(n / 2, minHeap.poll()); // Insert at middle O(n) for LinkedList
        }

        return sortedList;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 4, 7, 3, 6};
        List<Integer> sortedList = extremaPlacementSortWithHeaps(arr);
        System.out.println(sortedList); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}

/*
Time Complexity: 
O(nlogn) Best and Worst Case
Space Complexity: 
O(n)
*/
