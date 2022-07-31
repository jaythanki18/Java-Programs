import java.util.Scanner;
public class P1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] key = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
        String [][] answer = new String[8][10];
        System.out.println("Fill the Eight student's answers for 10 questions...");
        for(int i=0;i<answer.length;i++)
        {
            int count=0;
            for(int j=0;j<answer[i].length;j++)
            {
                answer[i][j] = sc.next();
            }
        }
        for(int i=0;i<answer.length;i++)
        {
            int count=0;
            for(int j=0;j<answer[i].length;j++)
            {
                if(answer[i][j].equalsIgnoreCase(key[j]))
                    count++;
            }
            System.out.println("Student's "+i+" correct answer are "+count);
        }
        System.out.println("This program is made by 21CE143 Jay");
    }
}

