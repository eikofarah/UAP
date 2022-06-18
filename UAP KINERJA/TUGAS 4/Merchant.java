package merchant;

public class Merchant {
    String namaMerchant, namaProduk;
    double harga;

    Merchant(String namaMerchant, String namaProduk, double harga){
        this.namaMerchant   = namaMerchant;
        this.namaProduk   = namaProduk;
        this.harga = harga;
    }

    public String getNamaProduk(){
        return namaProduk;
    }
    public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    public String getNamaMerchant(){
        return namaMerchant;
    }
    public void setNamaMerchant(String namaMerchant){
        this.namaMerchant = namaMerchant;
    }
    public double getHarga(){
        return harga;
    }
    public void setHarga(double harga){
        this.harga = harga;
    }
}