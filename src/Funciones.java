import java.util.List;
import java.util.Scanner;

public class Funciones {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);


        nombres("Mauricio");

        System.out.println("ingrese el primer numero");
        int numero = entrada.nextInt();

        System.out.println("ingrese el segundo numero");
        int numero2 = entrada.nextInt();

        System.out.println( funciones(numero, numero2 ));

        //Solicitamos los datos
        System.out.println("Ingrese un numero: ");
        int num = entrada.nextInt();

        System.out.println(matriz(num));



    }
    public static int funciones(Integer numero, Integer numero2){

        int multiplicar = numero*numero2;

        return multiplicar;
    }
    public static String nombres(String nombre){


        System.out.println(nombre) ;

        return nombre;
    }
    public static List matriz(Integer numero){


        return List.of();
    }

}
