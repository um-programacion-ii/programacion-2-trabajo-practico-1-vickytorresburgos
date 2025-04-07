import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        Vehiculo vehiculo1 = new Vehiculo("QWE123", "Ford", 2014, 4000.50);
        Vehiculo vehiculo2 = new Vehiculo("RTH456", "Toyota", 2023, 2700.75);
        Vehiculo vehiculo3 = new Vehiculo("BNJ741", "Chevrolet", 2025, 2500.30);
        Camion camion1 = new Camion("RFT745", "Fiat", 2005, 8000, true);
        Camion camion2 = new Camion("WFT963", "Volkswagen", 2024, 5000, false);
        Auto auto1 = new Auto("DFG852","Dodge", 2008, 2300, 5);
        Auto auto2 = new Auto("UJI526","Peugeot", 2016, 1700, 2);

        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);
        vehiculos.add(vehiculo3);
        vehiculos.add(camion1);
        vehiculos.add(camion2);
        vehiculos.add(auto1);
        vehiculos.add(auto2);

        VehiculoPrinter printer = new VehiculoPrinter();

        System.out.println("Listado de Vehículos");
        for (Vehiculo v : vehiculos){
            printer.printVehiculo(v);
        }

        String patenteBuscada = "ABC456";
        System.out.println("\nBuscando vehículo con patente:" + patenteBuscada);
        Vehiculo encontrado = buscarPorPatente(vehiculos, patenteBuscada);

        if (encontrado != null){
            System.out.println("Vehiculo encontrado");
            printer.printVehiculo(encontrado);
        } else {
            System.out.println("No se encontró ningún vehículo con la patente indicada. Intentelo otra vez con una patente diferente.");
        }
    }

    public static Vehiculo buscarPorPatente(ArrayList<Vehiculo> lista, String patente){
        for (Vehiculo v : lista){
            if (v.getPatente().equalsIgnoreCase(patente)){
                return v;
            }
        }
        return null;
    }

}
