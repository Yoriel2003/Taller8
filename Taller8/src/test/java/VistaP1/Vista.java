package VistaP1;

import ModeloP1.*;

public class Vista {

    public static void main(String[] args) {

        ITrabajador empleado = new Empleado("Secretaria");
        imprimirTrabajador(empleado);
        System.out.println("******************************************************");
        ITrabajador docente = new Docente(40);
        imprimirTrabajador(docente);
    }

    public static void imprimirTrabajador(ITrabajador t) {
        System.out.println("--> Sueldo: " + t.obtenerSueldo());
        System.out.println("--> Bonificacion: " + t.obtenerBonificacion());
    }

}
