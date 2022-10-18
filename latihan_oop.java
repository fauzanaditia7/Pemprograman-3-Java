class User {
    String nama;
    int umur;
    String alamat;

    User(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    int update_umur(int umur_baru) {
        this.umur = umur_baru;
        return this.umur;
    }

    String update_alamat(String alamat_baru) {
        this.alamat = alamat_baru;
        return this.alamat;
    }

    String[] get_data() {
        String[] data = new String[3];
        data[0] = this.nama;
        data[1] = String.valueOf(umur);
        data[2] = this.alamat;
        return data;
    }
}

public class latihan_oop {
    public static void main(String[] args) {
        User fauzan = new User("Fauzan Aditia", 19, "Cibubur Ciracas");
        System.out.println("Nama : " + fauzan.nama);
        System.out.println("Umur Lama : " + fauzan.umur);
        System.out.println("Umur Baru : " + fauzan.update_umur(19 + 1));
        System.out.println("Alamat Lama : " + fauzan.alamat);
        System.out.println("Alamat Baru : " + fauzan.update_alamat("Kalisari"));
        System.out.println();
        String[] data = fauzan.get_data();
        for (String a : data) {
            System.out.println(a);
        }
    }
}
