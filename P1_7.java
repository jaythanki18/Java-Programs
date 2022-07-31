public class P1_7 {
    public static void pyramid() {
        int ix = 30;
        for (int i = 1; i <= 128; i = i * 2) {
// x is the number printed
//it gets the value from i,
            for (int g = ix; g >= 0; g--) {
                System.out.print(" ");
            }
            for (int x2 = 1; x2 <= i - 1; x2 = x2 * 2) {
                System.out.print("   ");
                System.out.print(x2);
            }
            for (int x = i; x >= 1; x = x / 2) {
                System.out.print("   ");
                System.out.print(x);
            }
            ix = ix - 4;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pyramid();
        System.out.println("This program is made by 21CE143-Jay");
    }
}
