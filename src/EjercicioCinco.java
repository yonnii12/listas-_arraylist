import java.util.ArrayList;
import java.util.List;

public class EjercicioCinco {
    public static void main(String[] args) {

//        Objetivo: Convertir un ArrayList en un array nativo de Java.
//
//                Instrucciones:
//
//        Crea un ArrayList de enteros con los valores del 1 al 5.
//        Convierte este ArrayList en un array de tipo Integer[].
//                Imprime el contenido del array usando un bucle for.

        List<Integer> enteros = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            enteros.add(i);
        }
        System.out.println(enteros);

        Integer[] array = new Integer[enteros.size()];
        array = enteros.toArray(array);

        System.out.println("Contenido del array es el siguiente ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
