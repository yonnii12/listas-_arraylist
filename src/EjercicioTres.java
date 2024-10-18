import java.util.ArrayList;
import java.util.List;

public class EjercicioTres {
    public static void main(String[] args) {

//        Objetivo: Filtrar elementos en una lista según un criterio específico.
//
//                Instrucciones:
//
//        Crea un ArrayList de números enteros.
//        Llénalo con los números 1 a 10.
//        Filtra los números pares en una nueva lista llamada evenNumbers.
//        Imprime la lista original y la lista de números pares.

        List<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        System.out.println("La lista 'numero' contiene los elementos\n"+numeros);

        List<Integer> evenNumbers = new ArrayList<>();

        for(int calculo : numeros){
            if(calculo % 2 == 0){
                evenNumbers.add(calculo);
            }
        }

        System.out.println("La nueva lista con unicamente numeros pares es\n"+evenNumbers);



    }
}
