package desafio_05;

import java.util.Scanner;

public class Desafio_05 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        /* Monte um programa Java que mostre na tela em formato de tabela os
        quartos ocupados e os desocupados. Considere que o hotel tem 4 andares e 3
        quartos por andar. Primeiro, o usuário registrará os quartos ocupados,
        informando para cada ocupação o número do apartamento (andar de 1 a 4 e
        número de quarto de 1 a 3). O programa deverá questionar “Deseja informar
        outra ocupação? (S/N)” e o usuário poderá informar quantos quartos quiser, até
        que responda “N” a essa pergunta. Em seguida, o programa mostrará uma
        tabela, em que o primeiro andar é o inferior e o último, o superior, marcando
        com X o quarto ocupado. */
        
        Scanner entrada = new Scanner(System.in);
        
        char quarto[][] = new char[3][4];
        int andar, numero;
        char continuar = 'S';
        
        // [linha][coluna]
        
        for (int coluna = 0; coluna < 4; coluna++) {
            
            for (int linha = 0; linha < 3; linha++) {
                
                quarto[linha][coluna] = 'O';
            }
        }
        
        while (continuar != 'N') {
            
            System.out.println("-- REGISTRAR QUARTO OCUPADO --");
            
            char validacao;
            
            do {
                System.out.println("Andar: ");
                andar = entrada.nextInt();
                
                if (andar >= 1 && andar <= 4) {
                    validacao = 'S';
                } else {
                    validacao = 'N';
                    System.out.println("Andar inválido. Digite novamente: ");
                }
            } while (validacao != 'S');
            
            do {
                System.out.println("Quarto: ");
                numero = entrada.nextInt();
                
                if (numero >= 1 && numero <= 3) {
                    validacao = 'S';
                } else {
                    validacao = 'N';
                    System.out.println("Número inválido. Digite novamente: ");
                }
            } while (validacao != 'S');

            quarto[numero-1][andar-1] = 'X';

            System.out.println("Deseja informar outra ocupação? (S/N)");
            continuar = entrada.next().charAt(0);
        }

        System.out.println("-- DISPONIBILIDADE --");
        System.out.println("\n    " + quarto[0][3] + "  |  " + quarto[1][3] + "  |  " + quarto[2][3]);
        System.out.println("\n    " + quarto[0][2] + "  |  " + quarto[1][2] + "  |  " + quarto[2][2]);
        System.out.println("\n    " + quarto[0][1] + "  |  " + quarto[1][1] + "  |  " + quarto[2][1]);
        System.out.println("\n    " + quarto[0][0] + "  |  " + quarto[1][0] + "  |  " + quarto[2][0]);
    }
}