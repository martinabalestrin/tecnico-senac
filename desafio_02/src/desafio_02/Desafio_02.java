package desafio_02;

import java.util.Scanner;

public class Desafio_02 {

    public static void main(String[] args) {
        
        /*Escreva um programa Java que faça a troca de quartos entre dois hospedes. É
        preciso que ele receba o nome de um cliente e sua idade; o cliente a princípio será
        hospedado no quarto A. Depois, o programa deve receber o nome de outro cliente
        e sua idade; se o cliente for mais jovem, ficará no quarto B, mas, se a idade deste
        for maior que a do primeiro cliente, ele ficará no quarto A e o primeiro cliente ficará
        no quarto B. Além disso, se a pessoa mais velha for idosa (com 60 anos ou mais),
        terá desconto de 40%. O programa deve mostrar ao final o nome do cliente que
        ficou no quarto A e o desconto, se houver, e o nome do cliente que ficou no quarto
        B.*/
        
        Scanner entrada = new Scanner(System.in);
        
        String[] nome = new String[2];
        int[] idade = new int[2];
        int quartoA, quartoB; //vincular o id do hóspede com o quarto !
        String desconto = " ";
        
        // cadastro hóspede 1
        System.out.println("Informe o nome do hóspede 1: ");
        nome[0] = entrada.nextLine();
        System.out.println("Informe a idade do hóspede 1: ");
        idade[0] = entrada.nextInt();
        quartoA = 0;
        
        entrada.nextLine();
                
        // cadastro hóspede 2
        System.out.println("Informe o nome do hóspede 2: ");
        nome[1] = entrada.nextLine();
        System.out.println("Informe a idade do hóspede 2: ");
        idade[1] = entrada.nextInt();
        quartoB = 1;
        
        if (idade[1] > idade[0]) {
            
            quartoA = 1;
            quartoB = 0;
        }
        
        if (idade[quartoA] >= 60) {
            
            desconto = ", com 40% de desconto.";
        } 
        
        System.out.println("-- ORGANIZAÇÃO --");
        System.out.println("\nQuarto A: " + nome[quartoA] + desconto);
        System.out.println("Quarto B: " + nome[quartoB]);    
    }
}