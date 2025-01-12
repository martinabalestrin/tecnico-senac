package desafio_03;

import java.util.Scanner;

public class Desafio_03 {

    public static void main(String[] args) {
        
        /*Escreva um programa Java que receba o valor padrão de uma diária e em
        seguida receba vários nomes de hóspedes e suas idades. Caso a idade do
        hóspede seja menor de 4 anos, ele não paga hospedagem – nesses casos, é
        preciso que seja mostrada na tela a mensagem “(Nome do hóspede) possui
        gratuidade”. Hóspedes com mais de 80 anos pagam metade – então dever ser
        mostrado na tela “(Nome do hóspede) paga meia”. O usuário informará hóspedes
        até digitar a palavra “PARE”, que interrompe a entrada de dados. Ao fim, o
        programa deve mostrar a quantidade de gratuidades, a quantidade de meias
        hospedagens e o valor total, considerando todos os hóspedes informados */
        
        Scanner entrada = new Scanner(System.in);
        
        double valorDiaria, valorTotal = 0;
        String nomeHospede, continuar;
        int idadeHospede, numGratuidade = 0, numMeia = 0, numHospedes = 0;
        
        System.out.println("Informe o valor padrão de uma diária: ");
        valorDiaria = entrada.nextDouble();
        
        do {
            
            numHospedes++;
                    
            System.out.println("Informe o nome do hóspede: ");
            nomeHospede = entrada.next();

            System.out.println("Informe a idade de " + nomeHospede + ": ");
            idadeHospede = entrada.nextInt();
            
            if (idadeHospede < 4) {
                
                System.out.println(nomeHospede + " possui gratuidade.");
                numGratuidade++;
            }
            
            else if (idadeHospede >= 80) {
                
                System.out.println(nomeHospede + " paga meia.");
                valorTotal += (valorDiaria / 2);
                numMeia++;
            }
            
            else {
                
                valorTotal += valorDiaria;
            }
            
            System.out.println("Caso você não deseje continuar cadastrando hóspedes, escreva 'PARE'.");
            continuar = entrada.next();
        } while (!"PARE".equals(continuar));  
        
        System.out.println("Hóspedes cadastrados: " + numHospedes);
        System.out.println("Gratuidades: " + numGratuidade);
        System.out.println("Meias: " + numMeia);
        System.out.println("Valor total: " + valorTotal);
    }
}