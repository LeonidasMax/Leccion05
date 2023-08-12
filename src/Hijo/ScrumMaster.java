package Hijo;

import Padre.Empleado;

public class ScrumMaster extends Empleado {
//    private String departamento;

    public String getDepartamento(){
        return departamento;
    };


    public void setDepartamento(){};
    public ScrumMaster(String nombre, double sueldo, String depto) {
        super(nombre, sueldo);
        this.departamento = depto;
    }

        @Override
                public  String obtenerDetalles(){
                return "Des Hijo Nombre: "+this.getNombre()+" sueldo"+getSueldo()+"dire: "+this.getDepartamento();

        }

    }

}
@Override
    public String tosString(){
        return "su nombre es+ "+this.getNombre()+ "sueldo: "+this.getSueldo();

        }