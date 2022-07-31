import java.util.*;
public class P1_6 {
    P1_6(String[] words, String target) {
        int found = 0;
       for(int i=0;i<words.length;i++){
            if (words[i].equals(target)) {
                found++;
            }
        }
        found=words.length-found;
        int place=0;
        String[] str = new String[found];
        for (int j = 0; j < words.length; j++) {
           if(!words[j].equals(target)) {
                str[place] = words[j];// string element not equal to target are placed in new array.
                place++;
            }
        }
        System.out.println(Arrays.toString(str));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[5];
        String s1;
        System.out.println("Enter an array of the String");
        for(int i=0;i<5;i++)
        {
            s[i]=sc.next();
        }
        System.out.println("Enter the target String");
        s1 = sc.next();
        P1_6 obj = new P1_6(s,s1);
        System.out.println("THis program is made by 21CE143 Jay");
        sc.close();
    }

}
