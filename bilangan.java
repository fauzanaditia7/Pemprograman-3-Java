import java.util.*;

public class bilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data = new int[3];
        int terbesar, terkecil;
        for (int i = 0; i < 3; i++) {
            System.out.printf("Masukkan bilangan ke [(%s)] : ", i + 1);
            data[i] = input.nextInt();
        }
        terkecil = data[0];
        terbesar = data[0];
        for (int a : data) {
            if (terkecil > a) {
                terkecil = a;
            }
            if (terbesar < a) {
                terbesar = a;
            }
            String info = (a % 2 == 0) ? a + " adalah bilangan genap" : a + " adalah bilangan ganjil";
            System.out.println(info);
        }
        System.out.println("Bilangan terbesar : " + terbesar);
        System.out.println("Bilangan terkecil : " + terkecil);
    }    
}
