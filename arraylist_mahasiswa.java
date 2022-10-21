import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.*;

class Mahasiswa {
    private String name;
    private int age;
    private String npm;

    Mahasiswa(String name, int age, String npm) {
        this.name = name;
        this.age = age;
        this.npm = npm;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    String getNpm() {
        return this.npm;
    }

    void showData() {
        System.out.print(this.getName() + "\t\t" + this.getAge() + "\t" + this.getNpm());
    }
}

public class arraylist_mahasiswa {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            List<Mahasiswa> data_mahasiswa = new ArrayList<Mahasiswa>();
            String[] pilihan = {
                "Cetak Data",
                "Masukkan Data",
                "Mencari Data",
                "Kosongkan Data"
            };
            while (true) {
                for (int i = 0; i < pilihan.length; i++) {
                    System.out.println((i + 1) + ". " + pilihan[i]);
                }
                System.out.print("Silahkan pilih menu : ");
                int inputUser = Integer.parseInt(input.readLine());
                switch (inputUser) {
                    case 1:
                        if (!(data_mahasiswa.size() > 0)) {
                            System.out.println("Data masih kosong ");
                        } else {
                            System.out.println("Nama\t\tUmur\tNPM");
                            for (Mahasiswa mahasiswa : data_mahasiswa) {
                                mahasiswa.showData();
                                System.out.println();
                            }
                        }
                    break;
                    case 2:
                        System.out.print("Masukkan Nama : ");
                        String nama = input.readLine();
                        System.out.print("Masukkan Umur : ");
                        int umur = Integer.parseInt(input.readLine());
                        System.out.print("Masukkan NPM : ");
                        String npm = input.readLine();
                        data_mahasiswa.add(new Mahasiswa(nama, umur, npm));
                    break;
                    case 3:
                        Iterator<Mahasiswa> iterator = data_mahasiswa.iterator();
                        System.out.print("Masukkan NPM : ");
                        String cari = input.readLine();
                        int index = 0;
                        boolean ketemu = !true;
                        while (iterator.hasNext()) {
                            Mahasiswa mahasiswa = iterator.next();
                            if (mahasiswa.getNpm().equalsIgnoreCase(cari)) {
                                ketemu = true;
                                System.out.println("Nama\t\tUmur\tNPM");
                                mahasiswa.showData();
                                break;
                            }
                            index += 1;
                        }
                        if (ketemu) {
                            System.out.println("Data " + cari + " ditemukan pada index ke " + index);
                        } else {
                            System.out.println("Data " + cari + " tidak ditemukan");
                        }
                    break;
                    case 4:
                        if (!(data_mahasiswa.size() > 0)) {
                            System.out.println("Data masih kosong");
                        } else {
                            data_mahasiswa.clear();
                            System.out.println("Sukses mengkosongkan data ");
                        }
                    break;
                    default:
                        System.out.println("Silahkan Pilih 1 - 4");
                    break;
                }
                System.out.print("Lanjutkan Program ? [(Y/N)] : ");
                if (input.readLine().equalsIgnoreCase("n")) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan > " + e.getMessage());
        }
    }
}
