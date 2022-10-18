import java.util.*;

public class pola2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Batas : ");
        int batas = input.nextInt();
        for (int i = batas; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" O");
            }
            System.out.println();
        }
    }
}