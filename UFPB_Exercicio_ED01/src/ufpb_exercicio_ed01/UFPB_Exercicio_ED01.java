/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufpb_exercicio_ed01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Marcus
 */
public class UFPB_Exercicio_ED01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Listas ou arrays em Java podemos utilizar a biblioteca List
        List<Integer> i = new ArrayList<>();
        System.out.println("Iniciando a lista i" + i);
        System.out.println("O tamanho da lista é: " + i.size());

        boolean pergunta = true;
        String resposta = "s";
        int item, novoitem;
        Scanner sn = new Scanner(System.in);

        while (pergunta = true) {
            System.out.println("Deseja Adicionar algo à lista? (s/n): ");
            resposta = sn.nextLine();

            if (resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n")) {
                if (resposta.equalsIgnoreCase("s")) {
                    System.out.print("Qual número inteiro deseja acrescentar na lista: ");
                    item = sn.nextInt();
                    i.add(item);

                } else {
                    System.out.println("Fim da Lista");
                    pergunta = false;
                    break;
                }
            }
        }
        if (i.isEmpty()) {
            System.out.println("A lista está vazia");
        } else {
            System.out.println("A lista não está vazia");
            System.out.println("O tamanho da lista é: " + i.size() + " item(s)");
            System.out.println(i);
            pergunta = true;
            while (pergunta = true) {
                System.out.println("Deseja modificar algum item da lista(S/N)? ");
                resposta = sn.nextLine();
                if (resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n")) {
                    if (resposta.equalsIgnoreCase("s")) {
                        System.out.println(i);
                        System.out.println("Qual item deseja mofificar? ");
                        item = sn.nextInt();

                        int selecionado = i.get(item);

                        System.out.println("Você selecionou o " + selecionado);
                        System.out.println("Qual número deseja colocar na posição " + item + "?");
                        novoitem = sn.nextInt();

                        i.set(item, novoitem);

                        System.out.println("Sua nova lista é: " + i);

                    } else {
                        break;
                    }

                } else {
                    System.out.println("Deseja remover algum item da lista(S/N)? ");
                    resposta = sn.nextLine();
                    if (resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n")) {
                        if (resposta.equalsIgnoreCase("s")) {
                            System.out.println(i);
                            System.out.println("Qual item deseja mofificar? ");
                            item = sn.nextInt();

                            int selecionado = i.get(item);

                            System.out.println("Você selecionou o " + selecionado);
                            System.out.println("Posição " + item + "removida");
                            i.remove(item);
                            System.out.println("Sua nova lista é: " + i);

                        } else {
                            break;
                        }

                    }

                }

            }
        }
    }
}
