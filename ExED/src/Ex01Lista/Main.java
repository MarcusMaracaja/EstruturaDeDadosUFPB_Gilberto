/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01Lista;

import java.util.Scanner;

/**
 *
 * @author Marcus
 */

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Exercicio 01 ED\n"
                + "Lista!");
        //Vetor vetor = new Vetor(0);
        boolean menu = true;
        int escolha, size;

        Scanner user = new Scanner(System.in);
        System.out.print("Qual é o tamanho da lista: ");
        size = user.nextInt();
        Vetor vetor = new Vetor(size);
        System.out.println("Espaço reservado para o vetor: " + size + " elementos.");

        //if(size == 0){
        //  System.out.println("Fim do programa");
        //System.exit(0);
        //}else{
        for (int i = 0; i < size; i++) {
            System.out.print("Add o elemento: ");
            int ele = user.nextInt();
            vetor.adiciona(ele);
            //}
        }
        while (menu) {
            System.out.print("----MENU----\n"
                    + "1 - Mostrar o Vetor\n"
                    + "2 - Verificar se a Lista está vazia ou cheia\n"
                    + "3 - Adicionar elemento\n"
                    + "4 - Remover elemento\n"
                    + "5 - Sair\n"
                    + "Escolha: ");
            escolha = user.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println(vetor);
                    System.out.println("");
                    break;
                case 2:
                    if (vetor.vazia()) {
                        System.out.println("A lista está vazia\n");
                    } else /*if(vetor.cheia())*/ {
                        System.out.println("A Lista está cheia\n");
                    }
                    break;
                case 3:
                    System.out.println("O Vetor atual é: " + vetor);
                    System.out.print("Escolha um índice: ");
                    int num = user.nextInt();                                     
                    System.out.print("Qual número deseja adcionar\n"
                            + "antes do item [" + vetor.posicao(num) + "] ? ");
                    int novoElemento = user.nextInt();
                    
                    vetor.add(num, novoElemento);
                    
                    System.out.println(vetor);
                    break;
                case 4:
                    System.out.println("O Vetor atual é: " + vetor);
                    System.out.print("Escolha um índice para remover: ");
                    int numrem = user.nextInt();                                     
                                        
                    vetor.rem(numrem);
                    
                    System.out.println(vetor);
                    break;
                case 5:
                    System.out.println("Conclusão:\n");
                    System.out.println(vetor);
                    System.out.println("Lista cheia?" + vetor.cheia());
                    System.exit(0);
                    break;
                case 6:
                    default:
                        System.out.println("Escolha entre 1 e 5");
                    

            }

        }
    }
}
