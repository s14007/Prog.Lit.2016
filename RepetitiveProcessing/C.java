import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            if (x == 0 && y == 0) {
                break;
            } else {
                int xy = Math.multiplyExact(x, y);
                System.out.println(xy == 1 ? x + " " + y : y + " " + x);
            }
        }
    }
}
