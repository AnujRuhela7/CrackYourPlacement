package day1;
import java.util.*;
class MoveZeros
{
    public static void moveZeroes(int[] nums)
    {
        int ctr = 0;
        int idx = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 0)
            {
                nums[idx++] = nums[i];
            }
            else
            {
                ctr++;
            }
        }
        for(int j = nums.length-1; j >= nums.length-ctr; j--)
        {
            nums[j] = 0;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        moveZeroes(nums);
        for (int i = 0; i < n; i++)
        {
            System.out.print(nums[i] + " ");
        }
    }
}