package day1;
import java.util.*;
public class RemoveDuplicatesFromArray
{
    public static int removeDuplicates(int[] nums)
    {
        if (nums.length == 1)
            return 1;
        int k = 1;
        int i = 1;
        while (i < nums.length)
        {
            if (nums[i - 1] == nums[i])
            {
                i++;
            }
            else
            {
                nums[k] = nums[i];
                k++;
                i++;
            }
        }
        return k;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int k = removeDuplicates(arr);
        System.out.print("Array after removing duplicate elements : ");
        for (int i = 0; i < k; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}