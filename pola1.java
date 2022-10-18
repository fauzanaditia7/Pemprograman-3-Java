import java.util.Scanner;

public class pola1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Batas : ");
        int batas = input.nextInt();
        for (int a = 1; a <= batas; a++) {
            for (int b = 1; b <= batas; b++) {
                System.out.printf("%2d ", (a * b));
            }
            System.out.println();
        }
    }
}