import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas : ");
        int batas = input.nextInt();
        int a = 0, b = 1, c = a + b;
        do {
            System.out.print(c + " ");
            c = a + b;
            a = b;
            b = c;
        } while (c <= batas);
    }
}
