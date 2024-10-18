import java.util.ArrayList;
import java.util.List;

public class EjercicioUno {
    public static void main(String[] args) {

//        Ejercicio 1: Creación y manipulación básica de ArrayList
//        Objetivo: Practicar la creación de un ArrayList, agregar, eliminar y modificar elementos.
//
//                Instrucciones:
//
//        Crea un ArrayList de tipo String llamado fruits.
//        Agrega los siguientes elementos: "Apple", "Banana", "Cherry".
//                Imprime el tamaño de la lista y los elementos.
//        Elimina "Banana" de la lista.
//                Cambia el valor de "Cherry" por "Orange".
//                Imprime la lista resultante.


        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("La lista tiene un tamaño de "+fruits.size()+" elementos");
        System.out.println("Los elementos son: \n"+fruits);

        fruits.remove(1);
        fruits.set(1,"Orange");

        System.out.println("La lista final es: \n"+fruits);




    }
}
