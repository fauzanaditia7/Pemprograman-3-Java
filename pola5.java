import java.lang.Math;
import java.util.Scanner;

public class pola5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan batas : ");
        int batas = scanner.nextInt();
        batas /= 2;
        for (int i = batas; i >= -batas; i--) {
            for (int j = 1; j <= Math.abs(i); j++) {
                System.out.print(" ");
            }

            for (int k = batas; k >= Math.abs(i); k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
