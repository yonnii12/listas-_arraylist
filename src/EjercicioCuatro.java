import java.util.ArrayList;
import java.util.List;

public class EjercicioCuatro {
    public static void main(String[] args) {

//        Objetivo: Comparar dos listas y encontrar elementos comunes.
//
//                Instrucciones:
//
//        Crea dos ArrayList de String llamadas list1 y list2.
//                Llena list1 con: "Apple", "Banana", "Cherry", "Date".
//                Llena list2 con: "Banana", "Date", "Elderberry", "Fig".
//                Encuentra los elementos comunes entre las dos listas y guárdalos en una nueva lista llamada commonElements.
//                Imprime los elementos comunes.

        List<String> list1 = new ArrayList<>();

        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        list1.add("Date");


        List<String> list2 = new ArrayList<>();

        list2.add("Banana");
        list2.add("Date");
        list2.add("Elderberry");
        list2.add("Fig");

        List<String> commonElements = new ArrayList<>();

        for (String elemntos:list1){
            if(list2.contains(elemntos)){
                commonElements.add(elemntos);
            }
        }

        System.out.println("Los elementos comunes de la lista son:\n"+commonElements);

    }
}
