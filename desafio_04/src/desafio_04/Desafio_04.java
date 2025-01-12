package desafio_04;

import java.util.Scanner;

public class Desafio_04 {

    public static void main(String[] args) {
        
        /* Monte um algoritmo em que o usuário poderá cadastrar e pesquisar hóspedes. O
        algoritmo deve oferecer um menu com três opções ao usuário: 1- cadastrar; 2-
        pesquisar; 3- sair. A opção “cadastrar” deve permitir que o usuário informe um
        nome de hóspede, gravando-o em memória (máximo de 15 cadastros; caso atinja
        essa quantidade, mostre “Máximo de cadastros atingido”). A opção “pesquisar” deve
        permitir que o usuário informe um nome e, caso seja encontrado um nome
        exatamente igual, mostre a mensagem “Hóspede (nome) foi encontrado no índice
        (índice onde foi cadastrado)”. Se o nome não foi encontrado, mostre “Hóspede não
        encontrado”. O algoritmo deve permitir que o usuário realize essas operações
        repetidas vezes, até que use a opção “3”, que encerra o algoritmo. */
        
        Scanner entrada = new Scanner(System.in);
        
        String[] hospede = new String[15];
        String pesqHosp;
        int menu = 1, posicao = 0;
        
        while (menu != 3) {
            
            System.out.println("--- MENU ---");
            System.out.println("1. Cadastrar");
            System.out.println("2. Pesquisar");
            System.out.println("3. Sair");
            menu = entrada.nextInt();
            
            switch (menu) {
                
                case 1:
                    
                    if (posicao < 15) {
                        
                        System.out.println("Insira o nome do hóspede: ");
                        hospede[posicao] = entrada.next();
                        posicao++;
                    }
                    
                    else {
                        System.out.println("Número máximo de cadastros atingido.");
                    }
                    
                    break;
                    
                case 2:
                    
                    System.out.println("Insira o nome do hóspede: ");
                    pesqHosp = entrada.next();
                    
                    char localizado = 'N';
                    
                    for (int contagem = 0; contagem < 15; contagem++) {
                        
                        if (pesqHosp.equals(hospede[contagem])) {
                            
                            System.out.println("Hóspede " + pesqHosp + " foi encontrado no índice " + contagem);
                            localizado = 'S';
                        }
                    }
                        
                    if (localizado == 'N') {
                        
                        System.out.println("Hóspede não encontrado.");
                    }
                    
                    
                    break;
                    
                case 3: 
                    
                    System.out.println("Programa finalizado.");
                    
                    break;
                    
                default:
                    
                    System.out.println("Comando inválido.");
                    
                    break;
            }
        }
    }   
}