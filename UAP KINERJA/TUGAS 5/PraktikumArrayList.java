package praktikumarraylist;

public class PraktikumArrayList {
    public static void main(String[] args) {
        CarRider ming = new CarRider("Lin Ming", 19, "080000000000");
        CarRider yohan = new CarRider("Bei Youhan", 20, "081111111111");
        CarRider ling = new CarRider("Ling'er", 31, "082222222222");
        CarRider eiko = new CarRider("Eiko", 18, "085265999261");

        CarData data = new CarData();
        data.addCar("SUV", "N 1111 AB", "Honda");
        data.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
        data.addCar("TRUCK", "N 3333 AB", "Suzuki");
        data.addCar("ALPHARD", "N 6503 AB", "Toyota");

        data.listOfCar();

        RentArchive arsip = new RentArchive();
        arsip.Rent(ming, data.carList.get(1), 9);
        arsip.Rent(yohan, data.carList.get(0), 3);
        arsip.Rent(ling, data.carList.get(1), 1);
        arsip.Rent(eiko, data.carList.get(0), 6);

        System.out.println();
        Car.setStatus("true");
        Car.setStatus("true");
        Car.setStatus("false");
        Car.setStatus("true");

        System.out.println();
        arsip.info();
    }
    
}
