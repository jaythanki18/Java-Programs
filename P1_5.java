public class P1_5
{
    public static int stringMatch(String str1, String str2)
    {
        String s1, s2;
        int cnt = 0;
        for(int i = 0; i< (str1.length()) - 1; i++)
        {
            if(i< (str1.length()) - 2)
            {
                s1 = str1.substring(i, i + 2);
                s2 = str2.substring(i, i + 2);
            }
            else
            {
                s1 = str1.substring(i);
                s2 = str2.substring(i);
            }
            if(s1.equals(s2))
                cnt++;
        }
        return cnt;
    }

    public static void main(String[] args)
    {
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));
        System.out.println("This program is made by 21CE143 Jay");
    }
}

