package VistaP3;
import ModeloP3.*;
public class VistaP3 {
    public static void main(String[] args) {
        
        IColoreable figura = new Figura("Cuadrado");
        imprimirFigura(figura);
        System.out.println("***************************************");

    }
    private static void imprimirFigura(IColoreable f) {
        System.out.println("Mensaje: " + f.dibujar());
        System.out.println("Borrando: " + f.borrar());
       }
    
}
