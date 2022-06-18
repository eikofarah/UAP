package com.company;
import java.util.ArrayList;

public class Inheritance {

    public static void main(String[] args) {
        Manusia human1 = new Manusia("Eiko Farah Diva", "2171124605039001", false, true);
        Manusia human2 = new Manusia("Yuko Fildza Zafira", "2171124605039002", false, false);
        Manusia human3 = new Manusia("Seiichiro Azka Bilhaq ", "2171124605039003", true, true);
        ArrayList<Manusia> manusia = new ArrayList<Manusia>();
        manusia.add(human1);
        manusia.add(human2);
        manusia.add(human3);

        System.out.println("-------------------- MANUSIA --------------------");
        for(int i=0;i<manusia.size();i++){
            System.out.println(manusia.get(i).toString());
        }
        System.out.println("-------------------------------------------------");

        MahasiswaFilkom student1 = new MahasiswaFilkom("Nabila Zaien", "2171124605039004", false, false, "215150601111019", 3.6);
        MahasiswaFilkom student2 = new MahasiswaFilkom("Muhammad Rizky Ananda", "2171124605039005", true, true, "215150400111015", 4.0);
        MahasiswaFilkom student3 = new MahasiswaFilkom("Dyah Yuliana", "2171124605039006", false, true, "215150201111017", 3.4);
        ArrayList<MahasiswaFilkom> mahasiswa = new ArrayList<MahasiswaFilkom>();
        mahasiswa.add(student1);
        mahasiswa.add(student2);
        mahasiswa.add(student3);

        System.out.println();
        System.out.println("==================== MAHASISWA ====================");
        for(int i=0;i<mahasiswa.size();i++){
            System.out.println(mahasiswa.get(i).toString());
        }
        System.out.println("===================================================");

        Pekerja worker1 = new Pekerja("Muhammad Zaki", "2171124605039007", true, true, 7, 30, "1452125");
        Pekerja worker2 = new Pekerja("Naufal Humam", "2171124605039008", true, false, 9, 28, "2432126");
        Pekerja worker3 = new Pekerja("Ikke Nurjanah", "2171124605039009", false, true, 10, 26, "3422127");
        ArrayList<Pekerja> pekerja = new ArrayList<Pekerja>();
        pekerja.add(worker1);
        pekerja.add(worker2);
        pekerja.add(worker3);

        System.out.println();
        System.out.println("--------------------- PEKERJA ----------------------");
        for(int i=0;i<pekerja.size();i++){
            System.out.println(pekerja.get(i).toString());
        }
        System.out.println("---------------------------------------------------");

        Manajer manager1 = new Manajer("Atika Amanda", "2171124605039010", false, true,9, 25,"3412127", 3789);
        Manajer manager2 = new Manajer("Salsabilla Fitri", "2171124605039011", false, false,8, 28,"4422128", 3679);
        Manajer manager3 = new Manajer("Ilham Kusuma", "2171124605039012", true, true,6, 25,"5432129", 3432);
        ArrayList<Manajer> manajer = new ArrayList<Manajer>();
        manajer.add(manager1);
        manajer.add(manager2);
        manajer.add(manager3);

        System.out.println();
        System.out.println("===================== MANAGER =====================");
        for(int i=0;i<manajer.size();i++){
            System.out.println(manajer.get(i).toString());
        }
        System.out.println("===================================================");
        }
    }