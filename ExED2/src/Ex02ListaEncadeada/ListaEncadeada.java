/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex02ListaEncadeada;

import javax.swing.text.html.HTML;

/**
 *
 * @author Marcus
 */
public class ListaEncadeada {

    //ponteiro
    //No inicio = null;
    //int tamanho = 0; // inicia com tamanho zero
    private No cabeca;
    private int tamanho;

    public ListaEncadeada() {
        cabeca = null;
        tamanho = 0;
    }

    public boolean vazia() {
        if (tamanho == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int tamanho() {
        return tamanho;
    }

    //inserir na cabeça da lista
    public boolean inserirCabeca(int valor) {
        No no = new No(); //aloca na memoria
        no.setConteudo(valor); //coloca o conteudo
        no.setProximo(cabeca); //aponta o no para esse novo valor
        cabeca = no;
        tamanho++; //incrementa o tamanho
        return true;
    }

    //remover cabeça da lista
    public boolean removeCabeca() {
        if (cabeca == null) { //apenas se a lista estiver vazia
            System.out.println("A lista está vazia");
            return false;
        } else {
            cabeca = cabeca.getProximo(); //a o no inicial head, cabeça aponta pro proximo da cabeça
            tamanho--; //decrementa, o java mesmo desaloca, ja que não há ninguém apontando pra ele
            return true;
        }
    }

    //inserir cauda
    public boolean inserirCauda(int dado) {

        if (cabeca == null) { //apenas se a lista estiver vazia
            System.out.println("A lista está vazia");
            return false;
        } else {
            No no = new No();
            No aux = cabeca;
            no.setConteudo(dado);
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            no.setProximo(null);
            aux.setProximo(no);
            tamanho++;
            return true;
        }
    }
//remover cauda

    public boolean removerCauda() {

        if (cabeca == null) { //apenas se a lista estiver vazia
            System.out.println("A lista está vazia");
            return false;
        } else {
            No aux = cabeca;
            while (aux.getProximo() != null) {
                No auxNovo = aux;
                aux = aux.getProximo();
                if (aux.getProximo() == null) {
                    auxNovo.setProximo(null);
                    aux = auxNovo;
                    tamanho--;
                }
            }
            return true;
        }
    }

//inserir item na lista
    public boolean inserirLista(int pos, int dado) {
        int cont = 1;
        No novoNo = new No(); // Aloca memoria para novo no
        novoNo.setConteudo(dado);
// Localiza a pos. onde será inserido o novo nó
        No aux = cabeca;
        while ((cont < pos - 1) && (aux != null)) {
            aux = aux.getProximo();
            cont++;
        }
        if (aux == null) {
            return false;
        }
        novoNo.setProximo(aux.getProximo());
        aux.setProximo(novoNo);
        tamanho++;
        return true;
    }

    //pesquisa item na lista
    public boolean pesquisaLista(int dado) {
        int cont = 1;
        No aux;
        if (vazia()) {
            return false;
        }
        aux = cabeca;
        while (aux != null) {
            if (aux.getConteudo() == dado) {
                System.out.println(dado + " encontrado!");
                return true;
            }
            aux = aux.getProximo();
            cont++;
        }
        return true;
    }

    //remover item pesquisado na lista
    public int removIndiceDaLista(int pos) {
        No atual = null, antecessor = null;
        int dado = -1, cont = 1;
        atual = cabeca;
        while ((cont < pos) && (atual != null)) {
            antecessor = atual;
            atual = atual.getProximo();
            cont++;
        }
        if (atual == null) {
            return -1;
        }
        dado = atual.getConteudo();
        antecessor.setProximo(atual.getProximo());
        tamanho--;
        //atual = null;
        return dado;

    }

    /*
    para mostrar o conteúdo da lista
     */
    @Override
    public String toString() {
        String printa = "<< Tamanho = " + tamanho + " >> Conteúdo : ";
        No aux = cabeca;
        while (aux != null) {
            printa += aux.getConteudo() + " "; // cria espaços entre os itens
            aux = aux.getProximo(); // avança na lista até achar o null
        }
        return printa;

    }

}
