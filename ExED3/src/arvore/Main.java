/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

import static arvore.Arvore.buscar;
import static arvore.Arvore.inserir;
import static java.lang.System.exit;
import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Marcus
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.out.println("Exercicio 03: Arvore Binaria\n\n"
                + "Implemente a Árvore Binária de Busca. \n"
                + "Crie um arquivo main para poder testar as\n"
                + "seguintes operações:\n\n"
                
                + "  • Criar uma árvore vazia\n"
                + "  • Lista o conteúdo da árvore (in-ordem)\n"
                + "  • Buscar um elemento na árvore\n"
                + "  • Inserir novo elemento na árvore\n\n");
        
        boolean menu = true;
        Scanner in = new Scanner(System.in);

        int choice;
        while (menu) {
            System.out.print("Escolha um item:\n"
                    + "0 - Checar se Arvore está vazia\n"
                    + "1 - Inserir elemento\n"
                    + "2 - buscar elemento\n"
                    + "3 - listar itens (in-ordem)da árvore\n"
                    + "4 - criar árvore aleatóriria com 10 itens\n"
                    + "5 - SAIR\n"
                    + "Sua escolha: ");
            choice = in.nextInt();

            switch (choice) {
                case 0:
                    if (No.raiz == null) {
                        System.out.println("Arvore Vazia");
                    } else {
                        System.out.println("Árvore não vazia.");
                        Arvore.imprime(No.raiz);
                    }
                    sleep(2000);
                    break;

                case 1:
                    System.out.println("Inserir elemento in-ordem:");
                    int novoElemento = in.nextInt();
                    inserir(novoElemento);
                    System.out.println(novoElemento + " é uma nova folha.");
                    sleep(2000);
                    break;

                case 2:
                    System.out.println("Que numero quer localizar na árvore: ");
                    int pes = in.nextInt();
                    buscar(pes);
                    System.out.println("");
                    sleep(2000);
                    break;

                case 3:
                    Arvore.imprime(No.raiz);
                    System.out.println("");
                    sleep(2000);
                    break;

                case 4:
                    Random gerador = new Random();
                    for (int i = 0; i < 10; i++) {
                        inserir(gerador.nextInt(50));
                    }
                    System.out.println("Nova árvore aleatóra criada");
                    sleep(2000);
                    break;
                case 5:
                    exit(0);

                default:
                    System.out.println("Escolha entre 0 e 5");
                    System.out.println("");
                    sleep(2000);
            }
        }

    }

}
