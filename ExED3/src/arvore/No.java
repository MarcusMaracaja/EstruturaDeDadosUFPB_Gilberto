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
public class No {
    int conteudo;
    No esquerda;
    No direita;

    public No(int conteudo) {
        this.conteudo = conteudo;
    }
    
    public static No raiz;

    public int getConteudo() {
        return conteudo;
    }

    public void setConteudo(int conteudo) {
        this.conteudo = conteudo;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }
    
  
   

    
}
