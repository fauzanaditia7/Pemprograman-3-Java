import java.util.Scanner;

public class bilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah data : ");
        int jdata = input.nextInt();
        int[] data = new int[jdata];
        int terbesar, terkecil;
        for (int i = 0; i < jdata; i++) {
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
            String info = (a % 2 != 0) ? a + " adalah bilangan ganjil" : a + " adalah bilangan genap";
            System.out.println(info);
        }
        System.out.println("Bilangan terbesar : " + terbesar);
        System.out.println("Bilangan terkecil : " + terkecil);
    }    
}
