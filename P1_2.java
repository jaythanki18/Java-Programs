//Problem 1 : Given a string, return a string made of the first 2 chars (if present),
// however include first char only
// if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

import java.util.Scanner;
public class P1_2 {
    public static String startOz(String str){
        if (str.startsWith("oz"))
        return "oz";
  else if (str.startsWith("o"))
        return "o";
  else if (str.startsWith("z",1))
        return "z";
  else
        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        System.out.println(startOz(s1));
        System.out.println(startOz(s2));
        System.out.println(startOz(s3));
        System.out.println("This program is made by 21CE143 Jay");
    }

}
//deploy on docker as image from practical 1 file we can download it from anywhere ,(ubernetis)