import java.util.Scanner;
public class thirdpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // You can change this value to print a different size of the pattern
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
