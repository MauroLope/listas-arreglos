import java.util.ArrayList;
import java.util.List;

public class ListaDeListas {
    public static void main(String[] args) {
        //creamoa varias listas
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        List<Integer> lista3 = new ArrayList<>();
        List<Integer> lista4 = new ArrayList<>();
        List<Integer> lista5 = new ArrayList<>();
        List<Integer> lista6 = new ArrayList<>();
        List<Integer> lista7 = new ArrayList<>();
        List<Integer> lista8 = new ArrayList<>();
        List<Integer> lista9 = new ArrayList<>();
        List<List> matriz = new ArrayList<>();

        //agregamos datos a cada una de las listas
        lista1.addAll(List.of(1,2,3,4,5,6,7,8,9));
        lista2.addAll(List.of(1,2,3,4,5,6,7,8,9));
        lista3.addAll(List.of(1,2,3,4,5,6,7,8,9));
        lista4.addAll(List.of(1,2,3,4,5,6,7,8,9));
        lista5.addAll(List.of(1,2,3,4,5,6,7,8,9));
        lista6.addAll(List.of(1,2,3,4,5,6,7,8,9));
        lista7.addAll(List.of(1,2,3,4,5,6,7,8,9));
        lista8.addAll(List.of(1,2,3,4,5,6,7,8,9));
        lista9.addAll(List.of(1,2,3,4,5,6,7,8,9));

        //agregamos a matriiz cada una de las listas
        matriz.addAll(List.of(lista1,lista2,lista3,lista4,lista5,lista6,lista7,lista8,lista9));
        System.out.println(matriz);


        //recorremos la matriz desde la posicion 0 y con el .size indicamos que solo sean las cantidad que hay dentro
        for (int i = 0; i < matriz.size(); i++) {
            //reorremos cada lista dentro de la matriz
            for (int j = 0; j < matriz.get(i).size(); j++) {
                System.out.print(matriz.get(i).get(j));

                //en cada uno de los elementos ubicamos un separador menos en el ultimo espacio que es despues de elemento en la posicion 8
                if (j < matriz.get(i).size() - 1) {
                    System.out.print("-");
                }
            }
            //cada que termina de recorrer cada lista realiza un salto de linea para que quede una lista debajo de otra
            System.out.println();
        }
    }
}
