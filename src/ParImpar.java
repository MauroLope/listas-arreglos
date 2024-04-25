import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite un Numero para saber si es par o impar: ");
        int num = entrada.nextInt();

        if (num%2 == 0)
        {
            System.out.println("es par");
        }
        else
        {
            System.out.println("es impar");
        }
    }
}
