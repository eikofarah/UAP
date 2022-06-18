package polimorfisme;

public class Polimorfisme {

    public static void main(String[] args) {
        PegawaiTetap tetap1 = new PegawaiTetap("Ikke Nurjanah", "2171124605039009", 7000000);
        PegawaiTetap tetap2 = new PegawaiTetap("Naufal Humam", "2171124605039008", 2000000);
        PegawaiTetap tetap3 = new PegawaiTetap("Muhammad Zaki", "2171124605039007", 4000000);
        System.out.println(tetap1.toString());
        System.out.println(tetap2.toString());
        System.out.println(tetap3.toString());

        PegawaiHarian harian1 = new PegawaiHarian("Eiko Farah Diva", "2171124605039001", 9000, 50);
        PegawaiHarian harian2 = new PegawaiHarian("Yuko Fildza Zafira", "2171124605039002", 8500, 40);
        PegawaiHarian harian3 = new PegawaiHarian("Seiichiro Azka Bilhaq ", "2171124605039003", 50000, 30);
        System.out.println(harian1.toString());
        System.out.println(harian2.toString());
        System.out.println(harian3.toString());

        Sales penjual1 = new Sales("Atika Amanda", "2171124605039010", 50, 50000);
        Sales penjual2 = new Sales("Salsabilla Fitri", "2171124605039011", 40, 60000);
        Sales penjual3 = new Sales("Ilham Kusuma", "2171124605039012", 30, 100000);
        System.out.println(penjual1.toString());
        System.out.println(penjual2.toString());
        System.out.println(penjual3.toString());
    }
}
