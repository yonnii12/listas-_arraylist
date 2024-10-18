import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {

//        Objetivo: Practicar la iteración sobre listas.
//
//                Instrucciones:
//
//        Crea un ArrayList de números enteros llamado numbers y añade los números del 1 al 5.
//        Usa un bucle for para imprimir cada número.
//        Usa un bucle for-each para imprimir los mismos números.
//                Usa un bucle while para imprimir los números en orden inverso.


        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        System.out.println("La lista de elementos agregada es " + numbers);


        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("El elemento de posicion " + i + " Es " + numbers.get(i) + " con for");
        }

        for (int number : numbers) {
            System.out.println("Elemento " + number + " de la lista numbers con for-each");
        }

        int posicion = numbers.size() - 1;
        while (posicion >= 0) {
            System.out.println("El elemento de la posicion "+posicion+" es "+numbers.get(posicion)+"  con while");
            posicion--;
        }

    }
}
