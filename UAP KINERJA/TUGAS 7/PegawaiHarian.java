package polimorfisme;

public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }
    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }
    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public double gaji() {
        double pendapatan = 0;
        if (totalJam <= 40) {
            pendapatan = this.upahPerJam * this.totalJam;

        } else if (totalJam > 40) {
            pendapatan = this.upahPerJam * this.totalJam;
            pendapatan = (this.upahPerJam * 40) + (this.totalJam - 40) * (this.upahPerJam * 1.5);
        }
        return pendapatan;
    }

    @Override
    public String toString() {
        return "Pegawai Harian     : " + this.getNama() + "\n" + super.toString() + "\n" +
               "Upah/jam           : " + this.upahPerJam + "\n" +
               "Total jam kerja    : " + this.totalJam + "\n" +
               "Pendapatan         : Rp " + gaji() + "\n";
    }
}
