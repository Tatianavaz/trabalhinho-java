package Poo;

import java.io.Closeable;
import java.security.Key;
import java.util.HashMap;
import java.util.Scanner;

import javafx.scene.control.Spinner;

public class testenumero {
    public static void main(String[] args) {
        numero n = new numero();

        boolean continuar = true;

        Object system;
        Scanner Scan = new Scanner(System.in);
        while (continuar) {
    
            double x = 0;
            double y = 0;
            int operacao = 0;

            System.out.println("Digite a operacao que deseja saber:"
            +                    " \n1 Para soma "
            +                    " \n2 Para subtracao "
            +                    " \n3 Para multiplicacao "
            +                    " \n4 para divisao "
            +                    " \nou 0 Para finalizar o programa "
                       
            );
        
            operacao = Scan.nextInt();

            if(operacao == 0) {
                continuar = false;
                return;
            }

            System.out.println("Informe o valor do primeiro número");
            x = Scan.nextDouble();

            System.out.println("Informe o valor do segundo número");
            y = Scan.nextDouble();

            switch (operacao) {
                case 1:
                    imprimeCalculadora(operacao, n.soma(x, y), x, y);
                    break;
                case 2:
                    imprimeCalculadora(operacao, n.subtracao(x, y), x, y);
                    break;
                case 3:
                    imprimeCalculadora(operacao, n.multiplicacao(x, y), x, y);
                    break;
                case 4:
                    imprimeCalculadora(operacao, n.divisao(x, y), x, y);
                    break;
        
            }


        } Scan.close();
        
    }
    

    static void imprimeCalculadora(int operacao, double resultado, double x, double y) {
        HashMap <Integer, String> mapOperacao = new HashMap<>();
        mapOperacao.put(1, "somando");
        mapOperacao.put(2, "subtraindo");
        mapOperacao.put(1, "multiplicando");
        mapOperacao.put(1, "dividindo");
        System.out.println("\n o resultado de " + x + mapOperacao.get(operacao) + " por "+ y +  " e igual a " + resultado + "\n ");
        


}
       
}


