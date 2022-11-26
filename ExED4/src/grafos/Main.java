/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

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
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.out.println("Exercicio 04: Grafos\n\n"
                + "Implemente a estrutura grafo com representacao em: Matriz de Adjacencia\n"
                + "e Lista de Adjacencia. Depois implemente as seguintes atividades:\n"
                + "     • Leitor dos arquivos e carregamento das estruturas do grafo\n"
                + "     • Busca em largura (BFS)\n"
                + "     • Aplicar o BFS em todos os nos como fonte.\n"
                + "     • Criar uma funcao que imprima o caminho entre dois\n"
                + "         vertices s e t formado pelo BFS. Indicar que\n"
                + "         -nao ha caminho entre os vertices-\n"
                + "         caso nao haja o caminho.\n"
                + "     • Buca em Profundidade (DFS)\n"
                + "     • Reimplemente o DFS com auxilio de uma pilha para\n"
                + "         eliminar a recursao da implementacao\n\n"
        );

        boolean menu = true;
        Scanner in = new Scanner(System.in);

        int choice;

        while (menu) {
            System.out.print("Escolha um item:\n"
                    + "0 - Criar um Grafo com 10 nomes\n"
                    + "1 - Busca em largura (BFS)\n"
                    + "2 - Aplicar o BFS em todos os nos como fonte.\n"
                    + "3 - Imprima o caminho entre dois vertices\n"
                    + "4 - Buca em Profundidade (DFS\n"
                    + "5 - Reimplemente o DFS com auxilio de uma pilha para eliminar a recursao da implementacao\n"
                    + "6 - SAIR\n"
                    + "Sua escolha: ");
            choice = in.nextInt();

            switch (choice) {
                case 0:
                    Grafo<String> grafo = new Grafo<>();
                    System.out.println("Lista com dez nomes:\n"
                            + " 1 Marcus\n"
                            + " 2 Gilberto\n"
                            + " 3 Priscila\n"
                            + " 4 Alicia\n"
                            + " 5 Maria\n"
                            + " 6 Dario\n"
                            + " 7 Carolina\n"
                            + " 8 Lorena\n"
                            + " 9 Jose\n"
                            + " 10 Eduardo\n");
                    
                    grafo.adicionarVertice("Marcus");
                    grafo.adicionarVertice("Gilberto");
                    grafo.adicionarVertice("Priscila");
                    grafo.adicionarVertice("Alicia");
                    grafo.adicionarVertice("Maria");
                    grafo.adicionarVertice("Dario");
                    grafo.adicionarVertice("Carolina");
                    grafo.adicionarVertice("Lorena");
                    grafo.adicionarVertice("Jose");
                    grafo.adicionarVertice("Eduardo");

                    System.out.println("Vamos ligar as pessoas");
                    sleep(4000);
                    System.out.println("Ligando:\n"
                            + "Marcus, com peso 2, ate Priscila\n"
                            + "Priscila,com peso 5, ate Alicia\n" 
                            + "Maria, com peso 1, ate  Dario\n"
                            + "Dario, com peso 2, ate Carolina\n"
                            + "Lorena, com peso 4, ate Jose\n"
                            + "Jose, com peso 3, ate Eduardo\n"
                            + "Eduardo, com peso 1, ate Gilberto\n"
                            + "Gilberto, com peso 1, ate Marcus\n\n");
                   
                            grafo.adicionarAresta("Marcus",2 , "Priscila");
                            grafo.adicionarAresta("Priscila",5 ,"Alicia");
                            grafo.adicionarAresta("Maria",1 , "Dario");
                            grafo.adicionarAresta("Dario",2 , "Carolina");
                            grafo.adicionarAresta("Lorena",4 , "Jose");
                            grafo.adicionarAresta("Jose",3 , "Eduardo");
                            grafo.adicionarAresta("Eduardo",1 , "Gilberto");
                            grafo.adicionarAresta("Gilberto",1 ,  "Marcus");
                            break;
                        
                case 1:
                    sleep(2000);
                    break;

                case 2:
                    sleep(2000);
                    break;

                case 3:
                    sleep(2000);
                    break;

                case 4:
                    sleep(2000);
                    break;
                    
                case 5:
                    sleep(2000);
                    break;
                    
                case 6:
                    exit(0);

                default:
                    System.out.println("Escolha entre 0 e 6");
                    System.out.println("");
                    sleep(2000);
            }
        }

    }

}
