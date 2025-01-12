package desafio_01;

import java.util.Scanner;

public class Desafio_01 {

    public static void main(String[] args) {
        
        /* Relativo ao atendimento de eventos, o hotel necessita de uma funcionalidade
        que indique qual de seus dois auditórios é o mais adequado para um evento. O
        auditório Alfa conta com 150 lugares e espaço para até 70 cadeiras adicionais. O
        auditório Beta conta com 350 lugares, sem espaço para mais cadeiras. Desenvolva
        um programa Java que receba o número de convidados do evento e faça uma
        verificação sobre esse número: se for maior que 350 ou menor que zero, deverá ser
        mostrada a mensagem “Número de convidados inválido”. Se o valor informado é
        válido, deverá ser mostrado na tela qual dos auditórios é o mais adequado. No caso
        do auditório Alfa, será preciso calcular ainda quantas cadeiras adicionais serão
        necessárias, observando o limite citado anteriormente. */
        
        Scanner entrada = new Scanner(System.in);
        
        int numConvidados;
        
        System.out.println("Informe o número de convidados: ");
        numConvidados = entrada.nextInt();
        
        if (numConvidados > 0 && numConvidados <= 220) {
            
            System.out.println("Auditório adequado: Alfa");
            
            if (numConvidados > 150) {
                
                System.out.println("Adicione " + (numConvidados - 150) + " cadeiras extras.");
            }
        }
        
        else if (numConvidados > 220 && numConvidados <= 350) {
            
            System.out.println("Auditório adequado: Beta");
        }
        
        else {
                
            System.out.println("Número de convidados inválido.");
                
        } 
    }
}