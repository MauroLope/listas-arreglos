import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

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

        //Creamos la matriz
        List<List<Integer>> matriz = new ArrayList<>();

        //agregamos datos a cada una de las listas
        lista1.addAll(List.of(1,2,3,4,5,6,75,8,9));
        lista2.addAll(List.of(1,2,43,4,52,6,7,82,9));
        lista3.addAll(List.of(1,21,3,4,55,6,55,8,9));
        lista4.addAll(List.of(1,22,3,44,5,36,7,8,9));
        lista5.addAll(List.of(1,2,32,4,5,62,7,8,9));
        lista6.addAll(List.of(12,2,35,4,5,64,7,8,9));
        lista7.addAll(List.of(1,2,35,4,5,6,7,8,9));
        lista8.addAll(List.of(1,22,3,44,5,6,72,80,9));
        lista9.addAll(List.of(1,23,3,4,5,6,7,8,9));

        //agregamos a matriz cada una de las listas
        matriz.addAll(List.of(lista1,lista2,lista3,lista4,lista5,lista6,lista7,lista8,lista9));

        //Solicitamos los datos
        System.out.println("Ingrese un numero: ");
        int num = entrada.nextInt();

        //Variables Bandera para validacion dentro del for
        boolean seEncuentra = false;
        int posicionX = 0;
        int posicionY = 0;

        //Recorremos la matriz buscando el dato
        for (int i = 0; i < matriz.size(); i++) {

            //Recorremos la lista buscando el dato
            for (int j = 0; j < matriz.get(i).size(); j++) {

                //el dato se encuentra
                if (num == matriz.get(i).get(j)){

                    seEncuentra = true;
                    posicionY = j;
                    posicionX = i;
                }

                //Cortamos la busqueda con el primer dato encontrado
                if (seEncuentra == true)
                {
                    break;
                }
            }
        }
        //Se muestra en pantalla
        System.out.println("El dato '"+num +"' se encuentra en la posición "+posicionX + "," + posicionY);

    }
}
