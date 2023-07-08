package arrays.easy;
import java.util.*;
public class SortColours_DNFSort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int n = sc.nextInt();
        int[] colours = new int[n];
        System.out.println("Array Elements : ");
        for(int i = 0; i < n; i++)
            colours[i] = sc.nextInt();
        dnfSort(colours);
        System.out.println("Sorted Array : ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(colours[i] + " ");
        }
    }

    public static void dnfSort(int[] arr)
    {
        // We define three pointers low, mid and high
        // 0 -> low should lie all the zeros
        // low -> mid should lie all the ones
        // mid -> high should lie all the twos

        int low = 0, mid = 0, high = arr.length-1;
        while(mid <= high)
        {
            if(arr[mid] == 0)
            {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1)
            {
                mid++;
            }
            else if(arr[mid] == 2)
            {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
                // We don't increment the mid-pointer as we aren't aware what element is being
                // swapped from the end of array.
            }
        }
    }
}