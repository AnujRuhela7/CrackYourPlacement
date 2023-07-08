package arrays.easy;

import java.util.*;

public class TwoSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Array Elements : ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Target Sum : ");
        int target = sc.nextInt();

        System.out.println(twoSum(arr, target));
    }

    private static ArrayList<Integer> twoSum(int[] arr, int target)
    {
        ArrayList<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++)
        {
            if(map.containsKey(target - arr[i]))
            {
                res.add(map.get(target - arr[i]));
                res.add(i);
                return res;
            }
            map.put(arr[i], i);
        }
        return res;
    }
}