import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.add(100);
        lista.add(1000);
        lista.add(500);
        lista.add(150);
        lista.add(30);
        lista.add(9);
        lista.add(1);
        lista.add(1);

        for (int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }


        List<Integer> resultado = new ArrayList<>();
        for(int i=0; i< lista.size(); i++){
          resultado.add(lista.get(i)+100);
        }
        System.out.println("lista + 100: "+resultado);


        List<Integer> resultado2 = new ArrayList<>();
        for(int i=0; i< lista.size(); i++){
            resultado2.add(lista.get(i)*2);
        }
        System.out.println("lista * 2: "+resultado2);


        List<Integer> resultado3 = new ArrayList<>();
        for(int i=0; i< lista.size(); i++){
            int suma = lista.get(i)+100;
            int ulti = suma*2;

            resultado3.add(ulti);
        }
        System.out.println("lista + 100 * 2: "+resultado3);


        List<Integer> listaModulo2 = new ArrayList<>();
        for(int i=0; i<lista.size(); i++){
            listaModulo2.add(lista.get(i)%2);
        }
        System.out.println("lista % 2: "+listaModulo2);



        List<Integer> listaPar = new ArrayList<>();
        List<Integer> listaImpar = new ArrayList<>();
        List<Integer> multiplos3 = new ArrayList<>();

        for(int i=0; i< lista.size(); i++){
            if (lista.get(i)%2==0){
                listaPar.add(lista.get(i));
            }
            else {
                listaImpar.add(lista.get(i));
            }
            if (lista.get(i)%3==0){
                multiplos3.add(lista.get(i));
            }

        }
        System.out.println("lista Par: "+listaPar);
        System.out.println("lista impar: "+listaImpar);
        System.out.println("lista multiplos de 3: "+multiplos3);


    }
}


