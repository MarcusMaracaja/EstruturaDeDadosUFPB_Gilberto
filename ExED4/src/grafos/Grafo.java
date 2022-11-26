/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.ArrayList;

/**
 *
 * @author Marcus
 * @param <GRAFO>
 */
public class Grafo<GRAFO> {
 
    private ArrayList<Vertice<GRAFO>> vertices;
    private ArrayList<Aresta<GRAFO>> arestas;
    
    public Grafo(){
        this.vertices = new ArrayList<Vertice<GRAFO>>();
        this.arestas = new ArrayList<Aresta<GRAFO>>();
    }
    
    public void adicionarVertice(GRAFO dado){
        Vertice<GRAFO> novoVertice = new Vertice<GRAFO>(dado);
        this.vertices.add(novoVertice);
    }
    
    public void adicionarAresta(GRAFO dadoInicio, int peso, GRAFO dadoFim){
        Vertice<GRAFO> inicio = this.getVertice(dadoInicio);
        Vertice<GRAFO> fim = this.getVertice(dadoFim);
        Aresta<GRAFO> aresta = new Aresta<GRAFO>(peso, inicio, fim);
        inicio.adicionarArestaSaida(aresta);
        fim.adicionarArestaEntrada(aresta);
        this.arestas.add(aresta);
    }
    
    public Vertice<GRAFO> getVertice(GRAFO dado){
        Vertice<GRAFO> vertice = null;
        for(int i=0; i < this.vertices.size(); i++){
            if (this.vertices.get(i).getDado().equals(dado)){
                vertice = this.vertices.get(i);
                break;
            }
        }
        return vertice;
    }
    
    public void buscaEmLargura(){
        ArrayList<Vertice<GRAFO>> marcados = new ArrayList<Vertice<GRAFO>>();
        ArrayList<Vertice<GRAFO>> fila = new ArrayList<Vertice<GRAFO>>();
        Vertice<GRAFO> atual = this.vertices.get(0);
        marcados.add(atual);
        System.out.println(atual.getDado());
        fila.add(atual);
        while(fila.size() > 0){
            Vertice<GRAFO> visitado = fila.get(0);
            for(int i=0; i < visitado.getArestasSaida().size(); i++){
                Vertice<GRAFO> proximo = visitado.getArestasSaida().get(i).getFim();
                if (!marcados.contains(proximo)){ //se o vértice ainda não foi marcado
                    marcados.add(proximo);
                    System.out.println(proximo.getDado());
                    fila.add(proximo);
                }
            }
            fila.remove(0);
        }
    }
}
