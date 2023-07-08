package strings.easy;

import java.util.*;

public class ValidParenthesis
{
    public static boolean isValid(String s)
    {
        Stack<Character> stk = new Stack<>();
        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            {
                stk.push(')');
            }
            else if(ch == '[')
            {
                stk.push(']');
            }
            else if(ch == '{')
            {
                stk.push('}');
            }
            else if(stk.isEmpty() || stk.pop() != ch)
            {
                return false;
            }
        }
        return (stk.isEmpty());
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean isBalanced = isValid(str);
        if(isBalanced)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}