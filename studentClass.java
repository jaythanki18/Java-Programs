import java.util.*;
public class studentClass {
    public String name;
    void set()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the Student");
        String name = sc.next();
        System.out.println("Name :" + name);
    }

}
