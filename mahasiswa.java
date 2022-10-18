import java.io.*;

public class mahasiswa {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Masukkan jumlah data : ");
            int jdata = Integer.parseInt(input.readLine());
            String[][] data = new String[jdata][3];
            for (int i = 0; i < jdata; i++) {
                System.out.printf("Masukkan Nama [(%s)] : ", i + 1);
                data[i][0] = input.readLine();
                System.out.print("Masukkan Nilai Tugas : ");
                data[i][1] = input.readLine();
                System.out.print("Masukkan Nilai Praktek : ");
                data[i][2] = input.readLine();
                System.out.println();
            }
            System.out.println("Nama\t\tTugas\tPraktek");
            for (String[] item : data) {
                for (int i = 0; i < item.length; i++) {
                    System.out.printf("%s \t", item[i]);
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan > " + e.getMessage());
        }
    }
    
}
