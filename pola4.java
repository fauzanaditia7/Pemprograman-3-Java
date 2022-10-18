import java.util.*;

public class pola4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batasan : ");
        int batas = input.nextInt();
        // Segitiga 1
        for (int i = batas; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= batas -i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        // Segitiga 2
        for (int i = 1; i <= batas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= batas -i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }    
}
