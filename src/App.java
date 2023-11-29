import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Member member1 = new MemberReguler(10);

        System.out.println("Poin member1 adalah :" + member1.getPoin());
        System.out.println("");

        Scanner scanner = new Scanner(System.in);

        try{
            Member test1 = new Member(){};
            System.out.println("Masukkan No.Faktur: ");
            test1.nomorFaktur = scanner.nextLine();
            
            System.out.println("Masukkan Nama Pelanggan : ");
            test1.namePelanggan = scanner.nextLine();

            System.out.println("Masukkan No Hp :");
            test1.no_hp = scanner.nextLine();

            System.out.println("Masukkan Nama Barang :");
            test1.namaBarang = scanner.nextLine();

            System.out.println("Masukkan Harga Barang :");
            test1.hargaBarang = scanner.nextInt();

            System.out.println("Masukkan Jumlah Barang :");
            test1.jumlahBarang = scanner.nextInt();

            test1.totalBayar = (double) (test1.hargaBarang * test1.jumlahBarang);

            System.out.println("");
            System.out.println("");
            System.out.println("-------------------------");
            System.out.println("No. Faktur: " + test1.nomorFaktur);
            System.out.println("Nama Pelanggan: " + test1.namePelanggan);
            System.out.println("No Hp : " + test1.no_hp);
            System.out.println("Nama Barang: " + test1.namaBarang);
            System.out.println("Harga Barang: " + test1.hargaBarang);
            System.out.println("Jumlah Barang: " + test1.jumlahBarang);
            System.out.println("Total Bayar: " + test1.totalBayar);
            System.out.println("-------------------------");


        } catch (java.util.InputMismatchException e) {
            System.out.println("Maaf, input tidak valid. Pastikan memasukkan nilai numerik untuk harga dan jumlah barang.");

        }finally{
            scanner.close();
        }
    }
}
