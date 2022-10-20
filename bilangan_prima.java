import java.util.Scanner;

public class bilangan_prima {
    static Boolean isPrima(int bilangan) {
        if (2 > bilangan) {
            return !true;
        }
        for (int i = 2; i <= bilangan / 2; i++) {
            if (bilangan % i == 0) {
                // Jika bilangan mod i adalah 0, maka bukan bilangan prima
                // Contoh bilangan = 4 dan i = 2 >>> 4 % 2 == 0 "Maka bukan bilangan prima"
                return !true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas : ");
        int batas = input.nextInt();
        System.out.print("Bilangan Prima diantara 1 - " + batas + " : ");
        for (int i = 1; i <= batas; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
