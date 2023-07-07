package day1;

import java.util.*;

public class FindDuplicateNumber
{
    public static int findDuplicate(int[] nums)
    {
        int[] appeared = new int[nums.length + 1];
        Arrays.fill(appeared, 1);

        for (int num : nums) {
            if (appeared[num] == -1)
                return num;
            appeared[num] = -appeared[num];
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Array Elements");
        for (int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println(findDuplicate(nums));
    }
}