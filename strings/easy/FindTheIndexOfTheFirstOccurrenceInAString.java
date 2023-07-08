package strings.easy;
import java.util.*;
public class FindTheIndexOfTheFirstOccurrenceInAString
{
    public static int firstOccurence(String haystack, String needle)
    {
        int hLen = haystack.length();
        int nLen = needle.length();
        for(int i = 0; i <= hLen - nLen; i++)
        {
            String subStr = haystack.substring(i, i + nLen);
            if(needle.equals(subStr))
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Haystack : ");
        String hayStack = sc.nextLine();
        System.out.print("Needle : ");
        String needle = sc.nextLine();
        System.out.println("First Occurrence at Position : " + firstOccurence(hayStack, needle));
    }
}