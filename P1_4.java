import java.util.Scanner;
public class P1_4 {
    public static boolean arrOneTeoThree(int []arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==1 && arr[i+1]==2 && arr[i+2]==3){
                return true;
            }
        }return false;
    }
    public static void main(String[] args) {
        int [] arr1 = { 1,1,2,3,1};
        int [] arr2 = {1,1,2,4,1};
        int [] arr3 = {1,1,2,1,2,3};

        System.out.println(arrOneTeoThree(arr1));
        System.out.println(arrOneTeoThree(arr2));
        System.out.println(arrOneTeoThree(arr3));
        System.out.println("THis program is made by 21CE143 jay");
    }
}
