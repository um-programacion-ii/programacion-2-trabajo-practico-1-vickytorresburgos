public class VehiculoPrinter {

    public void printVehiculo(Vehiculo vehiculo){
        System.out.println("Información del vehículo");
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Marca: "+ vehiculo.getMarca());
        System.out.println("Año: "+ vehiculo.getAnio());
        System.out.println("Capacidad de carga (kg): "+ vehiculo.getCapacidadCargaKg() + "kg");
        System.out.println("--------------------------------------------");
    }
}
