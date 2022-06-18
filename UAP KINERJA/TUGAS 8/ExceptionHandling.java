package exceptionhandling;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Magician sihir = new Magician(10, 60, 100);
        Healer dokter = new Healer(10, 10, 70);
        Warrior prajurit = new Warrior(30, 25, 80);
        Titan monster = new Titan(0, 45, 200);
 
        System.out.println("Selamat datang di game Defense FILKOM !");
        System.out.print("Silahkan masukkan nama player : ");
        String nama = input.nextLine();
        int pilihan = 0;
        do{
            try{
                System.out.println("Silahkan pilih karakter yang anda inginkan :");
                String[] Role = {"1. Magician", "2. Healer", "3. Warrior"};
      
                for(String Hero : Role) {
                    System.out.println(Hero);
                }
                System.out.println("Masukkan karakter :");
                pilihan = input.nextInt();
                
                if (pilihan < 1 || pilihan > 3) throw new NumberFormatException();
                }catch (Exception e){
                if(e instanceof NumberFormatException) {
                    System.out.println("Silahkan masukan angka 1 - 3");
                }
                else{
                    System.err.println("Silahkan masukkan angka !!!");
                    input.next();
                }
             }
        }while (pilihan == 0);
            System.out.println("Selamat datang, " + nama);
 
        switch(pilihan){
            case 1 :
                int i = 1;
                sihir.info();
                while(sihir.getHp() != 0 && monster.getHp() != 0){
                    System.out.println("==============" + " TURN " + i + " ==============");
                    if(sihir.attack()){
                        monster.Damage(sihir.getAttack());
                    }
                    if(monster.attack()){
                        sihir.Damage(monster.getAttack()); 
                    }
                    System.out.println("Enemy's HP\t: " + monster.getHp());
                    System.out.println(nama +"'s HP\t: " + sihir.getHp());
                    i++;
                }
                System.out.println("====================================");
                if(monster.getHp() == 0) {
                System.out.println("yeayy, " + nama + " menang, selamatt!!\n");
                }
                if(sihir.getHp() == 0) {
                System.out.println("yahh Titan menang\n");
                }
                System.out.println("============== PLAYER ==============");
                sihir.info();
                System.out.println();
                System.out.println("============== MUSUH ==============");
                monster.info();
            break;
 
            case 2 :
                int j = 1;
                dokter.info();
                while(dokter.getHp() != 0 && monster.getHp() != 0){
                System.out.println("==============" + " TURN " + j + " ==============");
                if(j % 2 == 0) {
                dokter.Heal();
                }
                if(dokter.attack()){
                monster.Damage(dokter.getAttack());
                }
                if(monster.attack()){
                dokter.Damage(monster.getAttack()); 
                }
                System.out.println("Enemy's HP\t: " + monster.getHp());
                System.out.println(nama +"'s HP\t: " + dokter.getHp());
                j++;
                }
                System.out.println("====================================");
                if(monster.getHp() == 0) System.out.println("yeayy, " + nama + " menang, selamatt!!\n");
                if(dokter.getHp() == 0) System.out.println("yahh, Titan menang\n");
                System.out.println("============== PLAYER ==============");
                dokter.info();
                System.out.println();
                System.out.println("============== MUSUH ==============");
                monster.info();
            break;
 
            case 3 :
                int k = 1;
                prajurit.info();
                while(prajurit.getHp() != 0 && monster.getHp() != 0){
                System.out.println("==============" + " TURN " + k + " ==============");
                if(prajurit.attack()){
                monster.Damage(prajurit.getAttack());
                }
                if(monster.attack()){
                prajurit.Damage(monster.getAttack()); 

                }
                System.out.println("Enemy's HP\t: " + monster.getHp());
                System.out.println(nama +"'s HP\t: " + prajurit.getHp());
                k++;
                }
                System.out.println("====================================");
                if(monster.getHp() == 0) System.out.println("yeayy, " + nama + " menang, selamatt!!\n");
                if(prajurit.getHp() == 0) System.out.println("yahh, Titan menang\n");
                System.out.println("============== PLAYER ==============");
                prajurit.info();
                System.out.println();
                System.out.println("============== MUSUH ==============");
                monster.info();
                break;
            }
    }
}
