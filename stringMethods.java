public class stringMethods {
    public static void main(String[] args) {
        String name="Jay";
//        System.out.println(name.equals("Jay"));
//        System.out.println(name.equalsIgnoreCase("jAy"));
//        public boolean contains(CharSequence s);
      //   str = new String("Jay");
      //  System.out.println(name.equals(str)); // == operator checks memory  of both string and equals check only characters
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "     Jay     ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(1));
        System.out.println(name.substring(0,2));

        System.out.println(name.charAt(2));

        int result = name.codePointAt(0);
        System.out.println(result);

        int res = name.codePointBefore(3);
        System.out.println(res);

        int re = name.codePointCount(0, 3);
        System.out.println(re);

        String name2 = "Jay1"; //doubt
        System.out.println(name.compareTo(name2));

        String lastName = "Thanki";
        System.out.println(name.concat(lastName));

        System.out.println(name.contentEquals("Jay"));
        System.out.println(name.contentEquals("Hello"));

        String s1="abc";
        String s2 = new String("abc");
//        s1==s2;
//        {
//            System.out.println("true");
//        }
//        s3 = s2.intern();


//intern - to move our object/data from heap to pool we need intern
    }
}
