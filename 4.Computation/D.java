import java.util.*;

//見た目一緒
public class D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int max, min, sum = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        max = a[0];
        min = a[0];

        for (int num : a) {
            if (max < num) {
                max = num;
            } else if (min > num) {
                min = num;
            }
            sum += num;
        }
        System.out.printf("%d %d %d", min, max, sum);
    }
}
