import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RetornarElemento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //creamos varias listas
        List<Integer> lista = new ArrayList<>();

        //agregamos datos a cada una de las listas
        lista.addAll(List.of(2,4,3,6,15,16,6,8,9));

        //Solicitamos los datos
        System.out.print("Digite un Numero: ");
        int num = entrada.nextInt();

        //Variables Bandera para validacion dentro del for
        boolean esPresente = false;
        int posicion = 0;

        //Recorremos la lista buscando el dato
        for (int i = 0; i < lista.size(); i++) {

            //el dato se encuentra
            if (num == lista.get(i)){

                esPresente= true;
                posicion=i;

            }

        }
        //Validamos si se encontró el dato
        if (esPresente == true){

            System.out.println("El elemento esta en la posicion: "+ posicion);

        }
        else {
            System.out.println("El elemento no esta dentro del arreglo");
        }


    }


}
