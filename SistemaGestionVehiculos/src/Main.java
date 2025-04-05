//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("QWE123", "Ford", 2014, 4000.50);
        Vehiculo vehiculo2 = new Vehiculo("RTH456", "Toyota", 2023, 2700.75);
        Vehiculo vehiculo3 = new Vehiculo("BNJ741", "Chevrolet", 2025, 2500.30);

        vehiculo1.mostrarInformacion();
        vehiculo2.mostrarInformacion();
        vehiculo3.mostrarInformacion();
    }
}
