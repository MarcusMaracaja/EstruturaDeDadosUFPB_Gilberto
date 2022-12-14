/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01Lista;

import java.util.Arrays;

/**
 *
 * @author Marcus
 */
///com int
public class Vetor {

    private int[] elementos; //declaração do vetor, todos os elementos do vetor, pode ser int
    private int tamanho; //controla o tamanho total do vetor

    //construtor
    public Vetor(int capacidade) {
        this.elementos = new int[capacidade]; //passa a capacidade de elementos pra passar pro vetor
        this.tamanho = 0; //inicia o vetor com tamanho zero

    }

    public void adiciona(int elemento) {
       aumentaCapacidade();
        if (tamanho < this.elementos.length) { //verifica se o vetor já está no ultimo elemento
            elementos[tamanho] = elemento;
            tamanho++;
            
        } else {
            System.out.println("Vetor Cheio!");
        }
    }

    public void add(int pos, int elemento) {
        
        if (!(pos >= 0 && pos < tamanho)) {
            throw new IllegalArgumentException("ERROS");
        }
        //shift
        //tamanho++;  
        aumentaCapacidade();
        for (int i = this.tamanho - 1; i >= pos; i--) {
            this.elementos[i+1] = this.elementos[i];

        }
        
        this.tamanho++;
        this.elementos[pos] = elemento;

       // return false;
    }

    public void rem(int pos) {
        if (!(pos >= 0 && pos < tamanho)) {
            throw new IllegalArgumentException("ERROS");
        }
        //shift

        for (int i = pos -1; i < tamanho-1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        reduzCapacidade();
        this.tamanho--;
        
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "Vetor{" + " elementos = " + Arrays.toString(elementos) + " }\nTamanho: {" + tamanho + '}';
    }

    public boolean vazia() {
        if (tamanho == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cheia() {
        if (tamanho != 0) {
            return true;
        } else {
            return false;
        }
    }

    public int posicao(int pos) {
        if (!(pos >= 0 && pos < tamanho)) {
            throw new IllegalArgumentException("ERROS");
        }
        return this.elementos[pos];
    }

    public int buscador(int elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (this.elementos[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    private void aumentaCapacidade() {
        
       if (this.tamanho == this.elementos.length) {
       int[] dados = new int[this.elementos.length + 1];
                for(int i = 0;i<this.elementos.length;i++){
                    dados[i] = this.elementos[i];
                }elementos = dados;
        }
        
    }
        private void reduzCapacidade() {
        
       if (this.tamanho == this.elementos.length) {
       int[] dados2 = new int[this.elementos.length - 1];
                for(int i = elementos.length;i < elementos.length ;i--){
                    dados2[i] = this.elementos[i];
                }
                elementos = dados2;
        }
        
    }
}
