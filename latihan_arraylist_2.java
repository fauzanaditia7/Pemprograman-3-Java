import java.util.ArrayList;
import java.util.Scanner;

public class latihan_arraylist_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<Integer>();
        System.out.print("Masukkan jumlah data : ");
        int batas = input.nextInt();
        while (data.size() < batas) {
            System.out.print("Masukkan data ke - " + (data.size() + 1) + " : ");
            data.add(input.nextInt());
        }
        ArrayList<Integer> d = new ArrayList<>(data);
        d.sort(null);
        System.out.println("Data > "  + data);
        System.out.println("New Data (Sort) > " + d);
        int terbesar = data.get(0);
        int terkecil = data.get(0);
        for (int a : data) {
            if (a > terbesar) {
                terbesar = a;
            };
            if (a < terkecil) {
                terkecil = a;
            }
        }
        System.out.println("Bilangan Terbesar > " + terbesar);
        System.out.println("Bilangan Terkecil > " + terkecil);
    }
}
