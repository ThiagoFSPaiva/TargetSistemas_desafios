package target.desafio2;

import java.util.ArrayList;
import java.util.Scanner;

public class desafio_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> sequencia = new ArrayList<Integer>();

        int entrada;
        int numero = 1;
        int numero2 = 0;

        System.out.println("Digite o número para checar se está na sequencia");
        entrada = scan.nextInt();

        for (int i = 0; i <= entrada && numero2 <= entrada; i++){
            numero = numero + numero2;
            numero2 = numero - numero2;
            sequencia.add(numero2);
        }
        if (sequencia.contains(entrada)){
            System.out.println("O número pertence a seuquencia!");
        }else{
            System.out.println("O número não pertence a seuquencia!");
        }

    }
}
