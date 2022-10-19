public class convert_filesize {
    static String function(Long filesize) {
        String[] a = {
            " B", " KiB", " MiB", " GiB", " TiB"
        };
        int i = 0;
        while (filesize >= 1024) {
            i += 1;
            filesize /= 1024;
        };
        return filesize + a[i];
    }

    public static void main(String[] args) {
        long a = 1073741824;
        long b = a * 3;
        System.out.println(function(a));
        System.out.println(function(b));
    }
}
