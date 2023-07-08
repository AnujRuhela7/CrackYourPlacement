package arrays.easy;
import java.util.*;
public class ChocolateDistributionProblem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of Students (m): ");
        int m = sc.nextInt();
        System.out.print("No. of packets (n): ");
        int n = sc.nextInt();
        System.out.print("Chocolates in each packet: ");
        ArrayList<Integer> chocolates = new ArrayList<>();
        for(int i = 0; i< n; i++)
        {
            chocolates.add(sc.nextInt());
        }
        System.out.println(findMinDiff(chocolates, n, m));
    }
    public static long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        int diff = Integer.MAX_VALUE;
        for(int i = a.size()-1; i - (m-1) >= 0; i--)
        {
            if(a.get(i) - a.get(i-(m-1)) < diff)
            {
                diff = a.get(i) - a.get(i-(m-1));
            }
        }
        return diff;
    }
}