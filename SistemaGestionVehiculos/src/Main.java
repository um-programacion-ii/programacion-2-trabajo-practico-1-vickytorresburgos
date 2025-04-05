public class Main {
    public static void main(String[] args) {
        VehiculoPrinter printer = new VehiculoPrinter();

        Vehiculo vehiculo1 = new Vehiculo("QWE123", "Ford", 2014, 4000.50);
        Vehiculo vehiculo2 = new Vehiculo("RTH456", "Toyota", 2023, 2700.75);
        Vehiculo vehiculo3 = new Vehiculo("BNJ741", "Chevrolet", 2025, 2500.30);
        Camion camion1 = new Camion("RFT745", "Fiat", 2005, 8000, true);
        Camion camion2 = new Camion("WFT963", "Volkswagen", 2024, 5000, true);

        printer.printVehiculo(vehiculo1);
        printer.printVehiculo(vehiculo2);
        printer.printVehiculo(vehiculo3);
        printer.printVehiculo(camion1);
        printer.printVehiculo(camion2);
    }
}
