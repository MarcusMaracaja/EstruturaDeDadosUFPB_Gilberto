/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author Marcus
 */

public class Aresta<GRAFO> {
    
    private int peso;
    private Vertice<GRAFO> inicio;
    private Vertice<GRAFO> fim;
    
    public Aresta(int peso, Vertice<GRAFO> inicio, Vertice<GRAFO> fim){
        this.peso = peso;
        this.inicio = inicio;
        this.fim = fim;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Vertice<GRAFO> getInicio() {
        return inicio;
    }

    public void setInicio(Vertice<GRAFO> inicio) {
        this.inicio = inicio;
    }

    public Vertice<GRAFO> getFim() {
        return fim;
    }

    public void setFim(Vertice<GRAFO> fim) {
        this.fim = fim;
    }
    
    
}