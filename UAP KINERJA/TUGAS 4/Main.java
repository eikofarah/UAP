
package merchant;

public class Main {
   public static void main(String[] args) {
        Data.dag = Data.updateMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        Data.dag = Data.updateMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        Data.dag = Data.updateMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        Data.dag = Data.updateMerchant(new Merchant(Data.in.nextLine(),Data.in.nextLine(),Data.in.nextDouble()));
        Data.tampilData();
    } 
}
