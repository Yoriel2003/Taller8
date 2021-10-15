package ModeloP2;

import ModeloP2.IPersona.Persona;
import static ModeloP2.IPersona.imprimeArrayPersonas;
import java.util.Arrays;

public class VistaP2 {
    public static void main(String[] args) {
        Persona[] arrayPersonas = new Persona[7];
        arrayPersonas[0] = new Persona("Pancho  ", 24, 160);
        arrayPersonas[1] = new Persona("Fernando", 42, 189);
        arrayPersonas[2] = new Persona("Valeria ", 32, 150);
        arrayPersonas[3] = new Persona("Fabio   ", 47, 164);
        arrayPersonas[4] = new Persona("MAtias  ", 18, 167);
        arrayPersonas[5] = new Persona("Juliana ", 90, 170);
        arrayPersonas[6] = new Persona("Fernanda", 77, 175);

        System.out.println("Array sin ordenar por altura");
        System.out.println("------------------------------");
        imprimeArrayPersonas(arrayPersonas);
        Arrays.sort(arrayPersonas);
        System.out.println("\nArray ordenado por altura");
        System.out.println("-------------------------------");
        imprimeArrayPersonas(arrayPersonas);
    
}
}
