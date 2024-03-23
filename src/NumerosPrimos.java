import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite un Numero para saber si es primo o no: ");
        int numero = entrada.nextInt();

        for (int i=1; i<=numero; i++)
            if (numero%1==0 ){
                System.out.println("el numero"+ numero +" es Primo");
            }
            else{
                System.out.println("el numero"+ numero +" NO es Primo");
            }

    }
}
