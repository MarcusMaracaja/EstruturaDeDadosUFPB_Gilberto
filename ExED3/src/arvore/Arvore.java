/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

/**
 *
 * @author Marcus
 */
public class Arvore {

    private final No raiz;

    public Arvore() {
        raiz = null;
    }

    public static void inserir(int valor) {
        inserir(No.raiz, valor);

    }

    private static void inserir(No novoNo, int valor) {

        if (novoNo == null) { //se vazia cria uma nova raiz
            No.raiz = new No(valor);
            System.out.println("Árvore vazia o " + valor + " é a nova raiz.");

//////////////////////////////////////////////////////////            
        } else {
            //inserindo à esquerda
            if (valor < novoNo.conteudo) {
                if (novoNo.esquerda != null) {
                    inserir(novoNo.esquerda, valor); //recursividade
                } else {

                    novoNo.esquerda = new No(valor);
                }
                //inserindo à direita    
            } else {
                if (novoNo.direita != null) {
                    inserir(novoNo.direita, valor); //recursividade
                } else {

                    novoNo.direita = new No(valor);
                }
/////////////////////////////////////////////////////////            
            }
        }
    }

    public static void buscar(int valor) {
        buscar(No.raiz, valor);

    }

    private static boolean buscar(No novoNo, int valor) {
        boolean achou = false;
        if (novoNo == null) { //se vazia cria uma nova raiz
            System.out.println("Impossível buscar, " + valor + ", a árvore está vazia");
            achou = false;
            
        } else if (valor == novoNo.conteudo) {
            System.out.println("Elemento encontrado na raiz");
            achou = true;
            
        } else {
            if (valor < novoNo.conteudo) {
                //if (novoNo.esquerda != null) {
                    achou = buscar(novoNo.esquerda, valor); //recursividade
                //} else {
                    System.out.println(valor + " encontrado à esquerda de " + novoNo.conteudo);
                //}
            } else {
               // if (novoNo.direita != null) {
                    achou = buscar(novoNo.direita, valor); //recursividade
                //} else {
                    System.out.println(valor + " encontrado à direita de " + novoNo.conteudo);
                //}
            }
        }return achou;
    }

    public static void imprime(No aux) {

        if (aux != null) {
            System.out.print(aux.conteudo + " ");
            imprime(aux.esquerda);
            imprime(aux.direita);
        }
    }
}
