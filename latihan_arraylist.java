import java.util.ArrayList;
import java.util.Scanner;

public class latihan_arraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas : ");
        int batas = input.nextInt();
        ArrayList<Integer> angka = new ArrayList<Integer>();
        int i = 0;
        while (angka.size() <= batas) {
            i++;
            if (i % 2 == 0) {
                angka.add(i);
                angka.add(i * 2);
            }
        }
        System.out.println(angka);
    }    
}
