import java.util.Scanner;
public class StudiKasus1_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan jumlah uang yang dibayarkan: ");
        uangBayar = sc.nextInt();

        totalHarga = hargaPerCup * jumlahCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = (int)(totalHarga * 0.1 / 100);
            totalBayar = totalHarga - diskon;
        } else {
            totalBayar = totalHarga - diskon;
        } 
        System.out.println("Total Harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total Bayar: " + totalBayar);

        if (uangBayar >= totalBayar){
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang yang dibayarkan kurang sebesar: Rp" + kurang);
        }
        sc.close();
    }
}
