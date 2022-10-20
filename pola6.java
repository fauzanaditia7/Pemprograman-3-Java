import java.lang.Math;
import java.util.Scanner;

public class pola6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan batas : ");
        int batas = scanner.nextInt();
        batas /= 2;
        for (int i = batas; i >= -batas; i--) {
            for (int j = batas; j >= Math.abs(i); j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}