import java.util.Scanner;

public class StudiKasus202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        String jenis;
        int dokumen;
        int peringkat;
        int statusPKM;

        System.out.print("Nama mahasiswa: ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenis = sc.nextLine();
        System.out.print("Jumlah dokumen: ");
        dokumen = sc.nextInt();
        System.out.print("peringkat juara: ");
        peringkat = sc.nextInt();

        String status = "";

        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA")
                || jenis.equalsIgnoreCase("MANDIRI")) {
            if (dokumen < 4) {
                status = "Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.";
            } else if (peringkat >= 1 && peringkat <= 3) {
                status = "Dokumen lengkap. Dana penghargaan diberikan.";
            } else {
                status = "Dokumen lengkap, tetapi bukan Juara 1, 2, atau 3. " + "Dana penghargaan tidak diberikan.";
            }

        } else if (jenis.equalsIgnoreCase("PKM")) {
            System.out.print("Jumlah dokumen: ");
            dokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            statusPKM = sc.nextInt();

            if (dokumen < 4) {
                status = "Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.";
            } else if (statusPKM == 1) {
                status = "Dokumen lengkap. Dana penghargaan diberikan.";
            } else {
                status = "Dokumen lengkap, tetapi PKM tidak lolos pendanaan. " + "Dana penghargaan tidak diberikan.";
            }
        } else {
            status = "Kegiatan termasuk kategori Lainnya. Dana penghargaan tidak diberikan.";
        }

        System.out.println("Status " + nama + " : " + status);
        sc.close();
    }
}