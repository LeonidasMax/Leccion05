import Hijo.ScrumMaster;
import Padre.Empleado;

import java.util.Stack;

public class Main {

    public static void  imprime(Empleado emple){
        System.out.println("Objeto.obtenerDetalles()="+emple.obtenerDetalles());
    }
    public static void prueba(int dato) {
        System.out.println("nada");

    }

    public static void  determinarTipo(Empleado emple){
        if (emple instanceof ScrumMaster) {
            System.out.println("Esto viene de ScrumMaster");
        } else if (emple instanceof Empleado){
            System.out.println("Esto viene de empleado");
        } else if (emple instanceof Object){
            System.out.println("Esto es cualquier cosa");
        }

        }


    public static void main(String[] args) {
         Empleado em = new Empleado("juan", 3500);
         imprime(em);
//         System.out.println(em.obtenerDetalles());
        ScrumMaster sm = new ScrumMaster("juan", 3000, "desarrollo");
//        System.out.println(sm.obtenerDetalles());
        System.out.println(em.toString());



    }
}
