package Padre;

public class Empleado {
    private String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

        public String obtenerDetalles() {
            return "Nombre: " + this.getNombre() + " Sueldo: " +this.getSueldo();

        }
    public String getNombre() {
        return nombre;
//parte final
    }

    public void setNombre(String nombre) {
        if (nombre.equals("homero")) {
            this.nombre = "No Homeros";
        } else {
            this.nombre = nombre;

        }
        this.nombre = nombre;

    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
@Override
