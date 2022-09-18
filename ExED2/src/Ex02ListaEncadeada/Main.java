/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex02ListaEncadeada;

import static java.lang.System.exit;
import static java.lang.Thread.sleep;
import java.util.Scanner;

/**
 *
 * @author Marcus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.out.println("Exercicio 02: Lista encadeada");
        boolean menu = true;
        Scanner in = new Scanner(System.in);
        int choice;
        ListaEncadeada lista1 = new ListaEncadeada();
        while (menu) {
            System.out.print("Escolha um item:\n"
                    + "0 - Checar se lista está vazia\n"
                    + "1 - Criar lista Vazia\n"
                    + "2 - Inserir item na cabeça da lista\n"
                    + "3 - Inserir item na cauda da lista\n"
                    + "4 - Remover cabeça da lista\n"
                    + "5 - Remover cauda da lista\n"
                    + "6 - Inserir item numa determinada posição da lista\n"
                    + "7 - Pesquisar item na lista\n"
                    + "8 - Remover numa determinada posição, um item da lista\n"
                    + "9 - Mostrar a quantidade de itens e o conteúdo da lista\n"
                    + "10 - SAIR\n"
                    + "Sua escolha: ");
            choice = in.nextInt();

            switch (choice) {
                case 0:
                    if (lista1.vazia()) {
                        System.out.println("Vazia = " + lista1.vazia());
                        System.out.println("Lista Vazia");
                    } else {
                        System.out.println("Lista não vazia.");
                        System.out.println(lista1);
                    }
                    sleep(2000);
                    break;

                case 1:
                    System.out.println(lista1);
                    System.out.println("");
                    sleep(2000);
                    break;
                case 2:
                    System.out.println("Insira na cabeça da lista um número inteiro:");
                    int head = in.nextInt();
                    lista1.inserirCabeca(head);
                    System.out.println("");
                    System.out.println(head + " é a nova cabeça da lista.");
                    sleep(2000);
                    break;
                case 3:
                    System.out.println("Inserir Cauda:");
                    int cauda = in.nextInt();
                    lista1.inserirCauda(cauda);
                    System.out.println(cauda +" é a nova cauda da lista.");
                    sleep(2000);
                    break;
                case 4:
                    System.out.println("Removendo cabeça...");
                    lista1.removeCabeca();
                    sleep(2000);
                    System.out.println("Cabeça removida.");
                    sleep(2000);
                    break;
                case 5:
                    System.out.println("Removendo cauda...");
                    lista1.removerCauda();
                    sleep(2000);
                    System.out.println("Cauda removida.");
                    sleep(2000);
                    break;
                case 6:
                    System.out.println("Inserindo item na lista");
                    System.out.println(lista1);
                    System.out.println("Em que posição deseja inserir um item:");
                    int pos = in.nextInt();
                    System.out.println("Que item quer colocar?");
                    int dado = in.nextInt();
                    lista1.inserirLista(pos, dado);
                    System.out.println("");
                    sleep(2000);
                    break;
                case 7:
                    System.out.println("Que numero quer localizar na lista: ");
                    int pes = in.nextInt();
                    lista1.pesquisaLista(pes);
                    System.out.println("");
                    sleep(2000);
                    break;
                case 8:
                    System.out.println(lista1);
                    System.out.println("Escolha pelo índice que item gostaria de remover da lista: ");
                    int escolha = in.nextInt();
                    lista1.removIndiceDaLista(escolha);
                    sleep(2000);
                    break;
                          
                case 9:
                    System.out.println(lista1);
                    System.out.println("");
                    sleep(2000);
                    break;
                case 10:
                    exit(0);
                default:
                    System.out.println("Escolha entre 0 e 9");
                    System.out.println("");
                    sleep(2000);
            }
        }
    }
}
