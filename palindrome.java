public class palindrome {
    static Boolean isPalindrome(String kalimat) {
        String kalimat_baru = "";
        for (int i = kalimat.length() - 1; i >= 0; i--) {
            kalimat_baru += kalimat.charAt(i);
        }
        String a =  kalimat_baru.replace(" ", "");
        String b = kalimat.replace(" ", "");
        return a.equalsIgnoreCase(b);

    }

    public static void main(String[] args) {
        String[] data_coba = {
            "Ibu Ratna Antar Ubi",
            "Fauzan Aditia Pamungkas",
            "Never Odd Or Even",
            "Kasur Anna Rusak",
            "11/11/11",
            "Anya Geraldine",
            "Robert Trebor",
            "Iki Opo Iki"
        };
        for (String kalimat : data_coba) {
            String info = (isPalindrome(kalimat)) ? kalimat + " adalah Palindrome" : kalimat + " bukan Palindrome";
            System.out.println(info);
        }
    }
}
