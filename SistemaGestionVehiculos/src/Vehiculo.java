public class Vehiculo {
    private String patente;
    private String marca;
    private int anio;
    private double capacidadCargaKg;

    public Vehiculo(String patente, String marca, int anio, double capacidadCargaKg) {

        if (patente == null || patente.isEmpty()) {
            throw new IllegalArgumentException("Error. La patente no puede ser vacia, intente otra vez.");
        }
        if (anio < 1900 || anio > java.time.Year.now().getValue()) {
            throw new IllegalArgumentException("Error. El año del vehiculo debe estar entre 1900 y el año actual.");
        }
        if (capacidadCargaKg <=0) {
            throw new IllegalArgumentException("Error. La capacidad de carga debe ser positiva.");
        }

        this.patente = patente;
        this.marca = marca;
        this.anio = anio;
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    public double getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    public void setPatente(String patente) {
        if (patente == null || patente.isEmpty()) {
            throw new IllegalArgumentException("Error. La patente no puede ser vacia, intente otra vez.");
        }
        this.patente = patente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnio(int anio) {
        if (anio < 1900 || anio > java.time.Year.now().getValue()) {
            throw new IllegalArgumentException("Error. El año del vehiculo debe estar entre 1900 y el año actual.");
        }
        this.anio = anio;
    }

    public void setCapacidadCargaKg(double capacidadCargaKg) {
        if (capacidadCargaKg <=0) {
            throw new IllegalArgumentException("Error. La capacidad de carga debe ser positiva.");
        }
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public String obtenerDescripcion(){
        return "Informacion del Vehiculo \n Patente: " + patente + "\n Marca: " + marca + "\n Año: " + anio + "\n Carga: " + capacidadCargaKg + " kg";
    }
}
